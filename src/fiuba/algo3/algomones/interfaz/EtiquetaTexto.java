package fiuba.algo3.algomones.interfaz;

import java.awt.Color;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JLabel;

public class EtiquetaTexto extends JLabel {
	
	public EtiquetaTexto(String texto) {
		
		super(texto);
		
		this.setForeground(Color.black);
		
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
