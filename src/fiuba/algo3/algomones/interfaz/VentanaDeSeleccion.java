package fiuba.algo3.algomones.interfaz;

import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class VentanaDeSeleccion extends Ventana {
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new VentanaDeSeleccion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	VentanaDeSeleccion() {
		JLayeredPane panel = getPanel();
		
		EtiquetaTexto eligeATusAlgomones = new EtiquetaTexto("ELIGE A TUS ALGOMONES");
		eligeATusAlgomones.setBounds(175, 45, 690, 100);
		
		ImageIcon iconoCharmander = new ImageIcon("images/charmander.gif");
		BotonImagen charmander = new BotonImagen(iconoCharmander);
		charmander.setBounds (80, 157, 251, 251);

		ImageIcon iconoSquirtle = new ImageIcon("images/squirtle.gif");
		BotonImagen squirtle = new BotonImagen(iconoSquirtle);
		squirtle.setBounds (395, 154, 234, 257);
		
		ImageIcon iconoBulbasaur = new ImageIcon("images/bulbasaur.gif");
		BotonImagen bulbasaur = new BotonImagen(iconoBulbasaur);
		bulbasaur.setBounds (707, 168, 221, 227);
		
		ImageIcon iconoJigglypuff = new ImageIcon("images/jigglypuff.gif");
		BotonImagen jigglypuff = new BotonImagen(iconoJigglypuff);
		jigglypuff.setBounds (60, 431, 293, 269);

		ImageIcon iconoChansey = new ImageIcon("images/chansey.gif");
		BotonImagen chansey = new BotonImagen(iconoChansey);
		chansey.setBounds (330, 426, 364, 280);
		
		ImageIcon iconoRattata = new ImageIcon("images/rattata.gif");
		BotonImagen rattata = new BotonImagen(iconoRattata);
		rattata.setBounds (690, 437, 257, 257);

		panel.add(charmander, new Integer(2));
		panel.add(squirtle, new Integer(3));
		panel.add(bulbasaur, new Integer(4));
		panel.add(jigglypuff, new Integer(5));
		panel.add(chansey, new Integer(6));
		panel.add(rattata, new Integer(7));
		panel.add(eligeATusAlgomones, new Integer(8));
			
	}
}