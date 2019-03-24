package it.polito.tdp.alien;

import java.util.LinkedList;
import java.util.List;

public class AlienDictionary {

	LinkedList<Word> dizionario;
	
	public AlienDictionary() {
		dizionario= new LinkedList<Word>();
	}
	
	public void addWord(String alienWord, String translation) {


		Word s= this.cercaParola(alienWord);
		if(this.cercaParola(alienWord)!=null) {
			s.setTranslation(translation);
			
		} else {
			dizionario.add(new Word(alienWord,translation));
		}
	}
	
	public String translateWord(String alienWord) {
		Word trovata = this.cercaParola(alienWord);
		if(trovata==null) {
			return null;
		}
		else {
			return trovata.getTranslation();
		}
		
	}
	
	public Word cercaParola(String w) {
		Word word= new Word(w,null);
		int pos= this.dizionario.indexOf(word);
		if(pos==-1)
			return null;
		else {
			return this.dizionario.get(pos);
		}
	}
	
	
	
	
}
