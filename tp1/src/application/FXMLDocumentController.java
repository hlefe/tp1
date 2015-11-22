/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.control.TextField;

/**
 *
 * @author hulefevre
 */
public class FXMLDocumentController implements Initializable {
    Etudiant unEtudiant = new Etudiant();
   @FXML
   private Label description;
    
   @FXML
    private Label moyenne;
   
   @FXML
   private TextField nom;
   
   @FXML
   private TextField prénom;
   
   @FXML
   private TextField groupe;
   
   @FXML
   private Spinner<Integer> noteMaths;

   @FXML
   private Spinner<Integer> noteJava;
   
   @FXML
   private Spinner<Integer> noteAnglais;
   
    @FXML
    private void quitter() {
         Platform.exit();
    }

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        IntegerSpinnerValueFactory svalueAnglais = new IntegerSpinnerValueFactory(0,20);
        IntegerSpinnerValueFactory svalueMaths = new IntegerSpinnerValueFactory(0,20);
        IntegerSpinnerValueFactory svalueJava = new IntegerSpinnerValueFactory(0,20);
        noteAnglais.setValueFactory(svalueAnglais);
        noteMaths.setValueFactory(svalueMaths);
        noteJava.setValueFactory(svalueJava);
        
        nom.textProperty().bindBidirectional(unEtudiant.nomProperty());
        prénom.textProperty().bindBidirectional(unEtudiant.prenomProperty());
        groupe.textProperty().bindBidirectional(unEtudiant.groupeProperty());
        
        noteAnglais.getValueFactory().valueProperty().bindBidirectional(unEtudiant.noteAnglaisProperty());
        noteJava.getValueFactory().valueProperty().bindBidirectional(unEtudiant.noteJavaProperty());
        noteMaths.getValueFactory().valueProperty().bindBidirectional(unEtudiant.noteMathProperty());
        
        moyenne.textProperty().bind(unEtudiant.moyenneProperty());
       // int value = (Integer)noteAnglais.getValue();
       //moyenne.textProperty().bind(noteAnglais.editorProperty());
        //description.textProperty().bind(prénom.textProperty());
    }    
    
}
