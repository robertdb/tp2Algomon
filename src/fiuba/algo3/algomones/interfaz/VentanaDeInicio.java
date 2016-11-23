package fiuba.algo3.algomones.interfaz;

import java.awt.EventQueue;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class VentanaDeInicio extends Ventana {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new VentanaDeInicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	VentanaDeInicio() {
		JLayeredPane panel = getPanel();	
	    BotonTexto botonJugar = new BotonTexto("JUEGO NUEVO");
		botonJugar.setBounds (287, 430, 450, 62);
	    
		BotonTexto botonSalir = new BotonTexto("SALIR");
		botonSalir.setBounds (287, 530, 450, 62);
		
		ImageIcon iconoLogo = new ImageIcon("images/logo.png"); // TODO pixelizar logo
		JLabel logo = new JLabel(iconoLogo);
		logo.setBounds (112, 160, 800, 200);
		
		panel.add(botonJugar, new Integer(2));
		panel.add(botonSalir, new Integer(3));
		panel.add(logo, new Integer(4));
			
	}
}