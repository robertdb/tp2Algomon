package fiuba.algo3.algomones.interfaz;
	
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Juego;
import fiuba.algo3.algomones.interfaz.InicioController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


public class Main extends Application {
//	@Override
//	public void start(Stage primaryStage) {
//		try{
//			Juego juego = new Juego();
//			juego.introducirNombre("ash");
//			juego.introducirAlgomon(EspecieAlgomon.BULBASAUR);
//			juego.introducirAlgomon(EspecieAlgomon.CHANSEY);
//			juego.introducirAlgomon(EspecieAlgomon.CHARMANDER);
//			juego.siguienteTurno();
//			juego.introducirNombre("gary");
//			juego.introducirAlgomon(EspecieAlgomon.JIGGLYPUFF);
//			juego.introducirAlgomon(EspecieAlgomon.RATTATA);
//			juego.introducirAlgomon(EspecieAlgomon.SQUIRTLE);
//			
//			Combate combate = new Combate(primaryStage,juego);
//			combate.iniciarCombate();
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//	}
	
	@Override
	public void start(Stage stage) throws Exception {

		Juego juego = new Juego();
		
    	stage.setTitle("ALGOMON");
    
    	//Font.loadFont(this.getClass().getResource("fonts/minecraft.ttf").toExternalForm(),10);

    	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Inicio.fxml"));
    	
    	Parent root = (Parent)fxmlLoader.load();
         
    	InicioController controller = fxmlLoader.<InicioController>getController();

    	controller.setJuego(juego);
    	
        Scene escena = new Scene(root);    

    	escena.getStylesheets().addAll(this.getClass().getResource("style.css").toExternalForm());
    
    	stage.setScene(escena);
    	stage.setResizable(false);

    	stage.show();
    
    }
	
	public static void main(String[] args) {
		launch(args);
	}
}
