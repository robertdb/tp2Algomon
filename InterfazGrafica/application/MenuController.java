package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuController implements Initializable{
	
	public void onActionJugar(ActionEvent event) throws IOException{
		BorderPane layout = (BorderPane)FXMLLoader.load(getClass().getResource("SeleccionAlgomon.fxml"));
		Scene scene = new Scene(layout);
		Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		stage.setScene(scene);
		stage.show();
	}
	public void onActionCerrar(ActionEvent event){
		Platform.exit();
	}
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
