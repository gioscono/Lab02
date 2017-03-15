package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary al;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	al = new AlienDictionary();
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String result = txtWord.getText();
    	String[] parole = result.split(" ");
    	
    	if(parole.length==2){
    		String parolaAliena = parole[0];
    		String traduzione = parole[1];
    		
    		if(parolaAliena.matches("[a-zA-Z]+") && traduzione.matches("[a-zA-Z]+")){
    			parolaAliena = parolaAliena.toLowerCase();
    			traduzione = traduzione.toLowerCase();
    			al.addWord(parolaAliena, traduzione);
    		}
    		else{
    			txtResult.appendText("Attenzione, non possono essere insiriti numeri!!\n");
    		}
    	}
    
    	if(parole.length==1 && parole[0].compareTo("")!=0){
    		String parolaAliena = parole[0];
    		if(parolaAliena.matches("[a-zA-Z]+")){
    			parolaAliena = parolaAliena.toLowerCase();
    			String res = al.translateWord(parolaAliena);
    			txtResult.appendText("La traduzione e':\n"+res+"\n");
    		}
    		else{
    			txtResult.appendText("Attenzione, non possono essere insiriti numeri!!\n");
    		}
    	}
    	   txtWord.clear(); 	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {
    	txtResult.clear();
    }
    
}
