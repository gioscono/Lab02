package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	List<WordEnhanced> listaWords ;
	
	
	public AlienDictionary() {
		listaWords = new LinkedList<WordEnhanced>();
	}

	public void addWord(String alienWord, String translation){
		
		for(WordEnhanced w : listaWords){
			if(w.getAlienWord().compareTo(alienWord)==0){
				w.addWord(translation);
				return;
			}
		}
		
		WordEnhanced w = new WordEnhanced(alienWord, translation);
		listaWords.add(w);
		
	
	}
	
	public String translateWord(String alienWord){
		String ris = "";
		for(WordEnhanced w : listaWords){
			if(w.getAlienWord().compareTo(alienWord)==0){
				for(String traduz : w.getListaTraduzioni()){
					ris += traduz+"\n";
				}
			return ris;
			
			}
		}
		return null;
	}
	
	

}
