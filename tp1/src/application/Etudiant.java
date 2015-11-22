package application;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
/**
 *
 * @author Raphaël
 */
public class Etudiant {
    private final ObjectProperty<Integer> noteMath = new SimpleObjectProperty<>(0);
        public int getNoteMath() {
            return noteMath.get();
        }
        public void setNoteMath(int value) {
            noteMath.set(value);
        }
        public ObjectProperty<Integer> noteMathProperty() {
            return noteMath;
        }
    private final ObjectProperty<Integer> noteAnglais = new SimpleObjectProperty(0);
        public int getNoteAnglais() {return noteAnglais.get();}
        public void setNoteAnglais(int value) {noteAnglais.set(value);}
        public ObjectProperty<Integer> noteAnglaisProperty() {return noteAnglais;}
        
    private final ObjectProperty<Integer> noteJava = new SimpleObjectProperty(0);
        public int getNoteJava() {return noteJava.get();}
        public void setNoteJava(int value) {noteJava.set(value);}
        public ObjectProperty<Integer> noteJavaProperty() {return noteJava;}
    
    private final StringProperty nom = new SimpleStringProperty("");
        public String getNom() {return nom.get();}
        public void setNom(String value) {nom.set(value);}
        public StringProperty nomProperty() {return nom;}
        
    private final StringProperty prenom = new SimpleStringProperty("");
        public String getPrenom() {return prenom.get();}
        public void setPrenom(String value) {prenom.set(value);}
        public StringProperty prenomProperty() {return prenom;}
    
    private final StringProperty groupe = new SimpleStringProperty("");
        public String getGroupe() {return groupe.get();}
        public void setGroupe(String value) {groupe.set(value);}
        public StringProperty groupeProperty() {return groupe;} 
        
    private final StringProperty moyenne = new SimpleStringProperty("");
        public String getMoyenne() {return moyenne.get();}
        public void setMoyenne(String value) {moyenne.set(value);}
        public ReadOnlyStringProperty moyenneProperty() {return moyenne;}

    public Etudiant() {
        noteMath.addListener(new InvalidationListener() {

            @Override
            public void invalidated(Observable observable) {
                calculerMoyenne();
            }
        });
        noteAnglais.addListener(new InvalidationListener() {

            @Override
            public void invalidated(Observable observable) {
                calculerMoyenne();
            }
        });
        noteJava.addListener(new InvalidationListener() {

            @Override
            public void invalidated(Observable observable) {
                calculerMoyenne();
            }
        });
    }

    private void calculerMoyenne() {
        double moyenneCalculee = (getNoteMath() + getNoteAnglais() + getNoteJava())/3.;
        moyenne.set(String.format("%.2f", moyenneCalculee));
    }
}
