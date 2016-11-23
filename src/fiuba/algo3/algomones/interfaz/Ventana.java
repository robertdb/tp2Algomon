package fiuba.algo3.algomones.interfaz;

import java.awt.EventQueue;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Ventana extends JFrame{
	
	private JPanel contenedor;
	
	private JLayeredPane panel = new JLayeredPane();
	
	public Ventana() {
		this.setTitle("ALGOMON");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 804); // 1024x768 mas bordes
		setResizable(false);
		this.contenedor = new JPanel();
		this.contenedor.setLayout(null);
		setContentPane(this.contenedor);
		
		JLabel fondo = new JLabel();
		ImageIcon imagen = new ImageIcon("images/fondo.png");
		fondo.setIcon(imagen);
		fondo.setSize(1024, 768);

		JLabel primerPlano = new JLabel("Primer plano");
		primerPlano.setSize(200, 40);

		this.panel.add(fondo, new Integer(1));
		
		this.panel.setBounds(0, 0, 1024, 768);

		this.contenedor.add(this.panel);
		
	}
	
	protected JLayeredPane getPanel() {
		return this.panel;
	}

}