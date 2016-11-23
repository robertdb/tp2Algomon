package fiuba.algo3.algomones.interfaz;

import java.awt.Color;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BotonImagen extends JButton {
	
	public BotonImagen(ImageIcon imagen) {
		
		super(imagen);
		
		this.setBackground(Color.white);
		this.setBorderPainted(false);
		
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
