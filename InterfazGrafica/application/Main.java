package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//AnchorPane layout  =(AnchorPane)FXMLLoader.load(getClass().getResource("MenuPrincipal.fxml"));
			//Scene scene = new Scene(layout);
			//primaryStage.setScene(scene);
			//primaryStage.show();
			Combate combate = new Combate(primaryStage, null);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
