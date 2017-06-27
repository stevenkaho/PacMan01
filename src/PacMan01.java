import java.awt.EventQueue;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.Image;


import javax.imageio.ImageIO;
import javax.swing.JFrame;

import com.sun.prism.Graphics;


public class PacMan01 {

	private JFrame frmPacman;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PacMan01 window = new PacMan01();
					window.frmPacman.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				Image img;
			
				try {
					File input = new File("BlueBlock01.bmp");
					
					img = ImageIO.read(input);
					

				}
				catch(IOException ie)
				{
					System.out.println(ie.getMessage());
				}
			
			}
		
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public PacMan01() throws IOException {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	private void initialize() throws IOException {
		frmPacman = new JFrame();
		frmPacman.setTitle("PacMan");
		frmPacman.setBounds(100, 100, 450, 300);
		frmPacman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPacman.getContentPane().setLayout(null);	
		
		
	}
}
