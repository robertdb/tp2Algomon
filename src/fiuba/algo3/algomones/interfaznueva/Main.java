package fiuba.algo3.algomones.interfaznueva;

import fiuba.algo3.algomones.logica.Juego;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {
	
	private Juego juego;
	
	public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

    	stage.setTitle("ALGOMON");
    
    	Font.loadFont(
    			this.getClass().getResource("fonts/minecraft.ttf").toExternalForm(), 
    			10
    			);

    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
    	
    	Parent root = (Parent)fxmlLoader.load();
         
    	InicioController controller = fxmlLoader.<InicioController>getController();

    	controller.setJuego(juego);
    	
        Scene escena = new Scene(root);    

    	escena.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
    
    	stage.setScene(escena);
    	stage.setResizable(false);

    	stage.show();
    	
    	controller.setVentanaActual(stage);
    	
    }
    
    
}
