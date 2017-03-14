package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	List<Word> listaWords ;
	
	
	public AlienDictionary() {
		listaWords = new LinkedList<Word>();
	}

	public void addWord(String alienWord, String translation){
		
		for(Word w : listaWords){
			if(w.getAlienWord().compareTo(alienWord)==0){
				w.setTranslation(translation);
				return;
			}
		}
		
		Word w = new Word(alienWord, translation);
		listaWords.add(w);
		
	
	}
	
	public String translateWord(String alienWord){
		for(Word w : listaWords){
			if(w.getAlienWord().compareTo(alienWord)==0)
				return w.getTranslation();
		}
		return null;
	}
	
	

}
