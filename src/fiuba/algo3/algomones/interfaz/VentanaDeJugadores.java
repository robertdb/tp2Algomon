package fiuba.algo3.algomones.interfaz;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class VentanaDeJugadores extends Ventana {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new VentanaDeJugadores();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	VentanaDeJugadores() {
		JLayeredPane panel = getPanel();	
		
		EtiquetaTexto titulo = new EtiquetaTexto("CUAL ES TU NOMBRE?");
		titulo.setBounds (212, 50, 600, 200);
		
		//TODO ingresar nombre de los jugadores
		
		panel.add(titulo, new Integer(2));
			
	}
}