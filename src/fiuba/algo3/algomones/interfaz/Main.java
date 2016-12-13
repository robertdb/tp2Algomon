package fiuba.algo3.algomones.interfaz;
	
import fiuba.algo3.algomones.EspecieAlgomon;
import fiuba.algo3.algomones.Juego;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try{
			Juego juego = new Juego();
			juego.introducirNombre("gabriela");
			juego.introducirAlgomon(EspecieAlgomon.BULBASOUR);
			juego.introducirAlgomon(EspecieAlgomon.CHANSEY);
			juego.introducirAlgomon(EspecieAlgomon.CHARMANDER);
			juego.siguienteTurno();
			juego.introducirAlgomon(EspecieAlgomon.JIGGLYPUFF);
			juego.introducirAlgomon(EspecieAlgomon.RATTATA);
			juego.introducirAlgomon(EspecieAlgomon.SQUIRTLE);
			
			Combate combate = new Combate(primaryStage,juego);
			combate.iniciarCombate();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
