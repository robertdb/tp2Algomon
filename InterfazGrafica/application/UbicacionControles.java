package application;

import javafx.scene.Group;
import javafx.scene.control.Button;

public class UbicacionControles{
	private double columna1 = 100;
	private double columna2 = 500;
	private double columna3 = 800;
	private double alto = 70;
	private double ancho =300 ;
	private double fila1;
	private double fila2;
	private double fila3;
	public UbicacionControles(){
		fila1 = 490;
		fila2 = 490;
		fila3 = 490;
	}
	
	public Button  controlerProColumna(String text ){
		 Button boton = new Button();
		 boton.setPrefSize(ancho, alto);
		 boton.setLayoutX(columna1);
		 boton.setLayoutY(fila1);
		 fila1 = fila1 +100;
		 return boton;
		
	}
	public Button controlerPorColumnba2(String text){
		Button boton = new Button();
		 boton.setPrefSize(ancho, alto);
		 boton.setLayoutX(columna2);
		 boton.setLayoutY(fila2);
		 fila2 = fila2 +100;
		 return boton;
	}
	public Button controlerPorColumnba3(String text){
		Button boton = new Button();
		 boton.setPrefSize(ancho, alto);
		 boton.setLayoutX(columna3);
		 boton.setLayoutY(fila3);
		 fila3 = fila3 +100;
		 return boton;
	}
}
