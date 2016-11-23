package fiuba.algo3.algomones.interfaz;

import java.awt.Color;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JButton;

public class BotonTexto extends JButton {
	
	public BotonTexto(String texto) {
		
		super(texto);
		
		this.setForeground(Color.black);
		this.setBackground(Color.white);
		
		try {
			this.setFont(new Fuente().getFuente48Pt());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
