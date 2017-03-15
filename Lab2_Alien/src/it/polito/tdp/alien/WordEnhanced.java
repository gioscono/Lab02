package it.polito.tdp.alien;

import java.util.*;

public class WordEnhanced {
	private String alienWord;
	private String translation;
	private List<String> listaTraduzioni = new LinkedList<String>();
	
	public WordEnhanced(String alienWord, String translation) {
		this.alienWord = alienWord;
		this.translation = translation;
		listaTraduzioni.add(translation);
	}

	public boolean compare(String alienWord){
		if(this.alienWord.matches(alienWord))
			return true;
		return false;
		
	}

	public String getAlienWord() {
		return alienWord;
	}

	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	public void addWord(String traduzione){
		if(listaTraduzioni.contains(traduzione)==false)
			listaTraduzioni.add(traduzione);
	}

	public List<String> getListaTraduzioni() {
		return listaTraduzioni;
	}
	
	
	
	

}
