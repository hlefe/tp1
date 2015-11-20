/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.net.URL;
import java.util.ResourceBundle;
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
   private Spinner noteMaths;

   @FXML
   private Spinner noteJava;
   
   @FXML
   private Spinner noteAnglais;
   
   @FXML
   private Button quitter;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nom.setText("HEISENBERG");
        prénom.setText("Walt");
        groupe.setText("8");
        IntegerSpinnerValueFactory svalueAnglais = new IntegerSpinnerValueFactory(0,20);
        IntegerSpinnerValueFactory svalueMaths = new IntegerSpinnerValueFactory(0,20);
        IntegerSpinnerValueFactory svalueJava = new IntegerSpinnerValueFactory(0,20);
        noteAnglais.setValueFactory(svalueAnglais);
        noteMaths.setValueFactory(svalueMaths);
        noteJava.setValueFactory(svalueJava);
        quitter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
            System.exit(0);
            }
        });
       // int value = (Integer)noteAnglais.getValue();
       //moyenne.textProperty().bind(noteAnglais.editorProperty());
        //description.textProperty().bind(prénom.textProperty());
    }    
    
}
