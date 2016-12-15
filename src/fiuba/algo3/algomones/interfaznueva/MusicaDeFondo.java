package fiuba.algo3.algomones.interfaznueva;

import java.io.File;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

public class MusicaDeFondo implements Runnable {

	@Override
	public void run() {
		
	    File archivo = new File("sounds/pokemontheme.wav");
	    AudioInputStream stream;
	    AudioFormat formato;
	    DataLine.Info info;
	    Clip clip;

	    try {
			
	    	stream = AudioSystem.getAudioInputStream(archivo);
	    	formato = stream.getFormat();
	    	info = new DataLine.Info(Clip.class, formato);
	    	clip = (Clip) AudioSystem.getLine(info);
	    	clip.open(stream);
	    	clip.loop(Clip.LOOP_CONTINUOUSLY);
	    	clip.start();
	    
	    }
	    
	    catch (Exception e) {
	    }


	}

}
