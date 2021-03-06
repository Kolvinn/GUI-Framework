package topLevel;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JLayeredPane;

public abstract class LayeredPane extends JLayeredPane {

	private static final long serialVersionUID = 1L;
	protected Image background, button;
	protected static int width = 1200, height =1000, btnWidth = 180, btnHeight=70, btnDist=20;
	protected GameWindow window ;
	public LayeredPane(GameWindow window){
		this.window=window;
	}
	
	public void update(String s){
		
	}
	/**
	 * Read all the images that the menu will use
	 */
	protected void readImages(){
		System.out.println("reading images");
		try {
			background = ImageIO.read(new File("src/menu/MainMenu.jpg"));
			button  = ImageIO.read(new File("src/menu/button2.png"));
		} catch (IOException e) {
			System.out.println("FAILURE");
			e.printStackTrace();
		}
	}
	/**
	 * creates the menu background
	 */
	protected void setBackground(){
		//create the background
		ImagePanel p = new ImagePanel(background,this);
		p.setBounds(0, 0, width,height);
		//System.out.println("setting background");
		this.add(p,DEFAULT_LAYER);
	}
}
