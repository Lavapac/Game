import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JFrame;
import javax.swing.JPanel;
public class Player extends JPanel {
	private int level;
	private int infectedOnTrain;
	public Player() {
		level = 1;
		infectedOnTrain = 0;
	}
	
	public void paint(Graphics g) {
		super.paint(g); //Clears the panel, for a fresh start
		Graphics2D g2d = (Graphics2D) g;
		//Smooth’s out the movement
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		/*b.paint(g2d);
		c.paint(g2d);
		d.paint(g2d);
		e.paint(g2d);
		for (Parcel a:ParcelList)
			a.paint(g2d);
		f.paint(g2d);*/
	}
	
	private void move() {
		/*for (Parcel a:ParcelList)
			a.move();
		c.collision(ParcelList);
		d.collision(ParcelList);
		e.collision(ParcelList);
		f.collision(ParcelList);*/
	}
	
	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Object Example");
		Player p = new Player();
		frame.add(p);
		frame.setSize(1020,640);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		while (true)
		{
			p.move(); //Updates the coordinates
			p.repaint(); //Calls the paint method
			Thread.sleep(10); //Pauses for a moment
		}
	}
}

