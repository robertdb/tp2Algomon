package fiuba.algo3.algomones.interfaz;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Fuente {

    private Font fuente48Pt;
	
	public Fuente() throws IOException, FontFormatException {
		
		File archivoFuente = new File("fonts/minecraft.ttf");
    	FileInputStream input = new FileInputStream(archivoFuente);
    	Font fuente = Font.createFont(Font.TRUETYPE_FONT, input);
    	this.fuente48Pt = fuente.deriveFont(48f);
    	
	}
    
    public Font getFuente48Pt() {
    	return this.fuente48Pt;
    }

   // private JLabel testLabel = new JLabel("CUAL ES TU NOMBRE?");
   // testLabel.setFont(fuente48Pt);
   // JFrame frame = new JFrame("Font Loading Demo");
   // frame.getContentPane().add(testLabel);
   // frame.pack();
   // frame.setVisible(true);
  //}
}