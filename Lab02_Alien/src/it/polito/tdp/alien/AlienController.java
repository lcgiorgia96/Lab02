package it.polito.tdp.alien;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	String a;
	String t;
	AlienDictionary dizionario;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtWord;

    @FXML
    private Button btnTranslate;

    @FXML
    private TextArea txtResult;

    @FXML
    private Button btnReset;

    @FXML
    void doReset(ActionEvent event) {
    	txtWord.clear();
    	txtResult.clear();
    	dizionario.dizionario= new LinkedList<Word>();
    }

    @FXML
    void doTranslate(ActionEvent event) {
    	
    	
    	String[] tot= txtWord.getText().split(" ");
    	a=tot[0];
    	t=tot[1];

    	if (t!=null) {
    		dizionario.addWord(a,t);
    		txtWord.clear();
    		txtResult.clear();
    		} 
    	else {
    		String trad=dizionario.translateWord(a);
    		txtResult.appendText(trad);
    	}
   }

   @FXML
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
        dizionario= new AlienDictionary();
        a=null;
        t=null;
    }
}
