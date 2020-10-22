/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoChoiceBox;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.beans.value.ChangeListener;

/**
 *
 * @author FP Mañana A
 */
public class ClasePrincipal extends Application implements ChangeListener{
VBox v;
ChoiceBox cb;
Label lb_texto;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

        @Override
	public void start(Stage window) throws Exception {
            String idiomas[]={"Spanish","English","German"};
            v=new VBox(10);
            cb=new ChoiceBox();
            cb.setItems(FXCollections.observableArrayList(idiomas));
            lb_texto=new Label();
            cb.valueProperty().addListener(this);
            v.getChildren().addAll(cb,lb_texto);
            Scene escena=new Scene(v,300,300);
            window.setScene(escena);
            window.show();
	}

    @Override
    public void changed(ObservableValue ov, Object t, Object t1) {
        if(cb.getSelectionModel().getSelectedItem()=="Spanish"){
            lb_texto.setText("Seleccionaste el idioma español");
        }
        else if(cb.getSelectionModel().getSelectedItem()=="English"){
            lb_texto.setText("You selected the english language");
        }
        else if(cb.getSelectionModel().getSelectedItem()=="German"){
            lb_texto.setText("Sie haben die deutsche Sprache ausgewählt");
        }
    }
}
