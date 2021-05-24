import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseListener;
import java.awt.geom.Line2D;
import java.awt.event.MouseEvent;
//Write a program that allows the user to specify a triangle with three mouse presses. After the first mouse press, draw a small dot. After the second mouse press, draw a line joining the first two points. 
//After the third mouse press, draw the entire triangle. The fourth mouse press erases the old triangle and starts a new one.

public class TriangleComponent extends JFrame{
	
	public int counter = 0;
	private static final int FRAME_WIDTH = 300;
	private static final int FRAME_HEIGHT = 400;
	public int x1;
	public int x2;
	public int x3;
	public int y1;
	public int y2;
	public int y3;
	
	public interface MouseListener
	{  
	   void mousePressed(MouseEvent event);
	   void mouseReleased(MouseEvent event);
	   void mouseClicked(MouseEvent event);
	   void mouseEntered(MouseEvent event);
	   void mouseExited(MouseEvent event);
	}
	
	

	public TriangleComponent() {
		
		class MousePressListener implements MouseListener {
			public void mousePressed(MouseEvent event) {
				counter++;
				switch(counter) {
					case 0:
						x1 = event.getX();
						y1 = event.getY();
					case 1:
						x2 = event.getX();
						y2 = event.getY();
					case 2:
						x3 = event.getX();
						y3 = event.getY();
						counter = 0;
				}
				repaint();
			}

				public void mouseReleased(MouseEvent event) {}
				public void mouseClicked(MouseEvent event) {}
				public void mouseEntered(MouseEvent event) {}
				public void mouseExited(MouseEvent event) {}
		}
		
		
		//addMouseListener(new MousePressListener());
		
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
	}
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		switch(counter) {
		case 1:
			g2.draw(new Line2D.Double(x1, y1, x2, y2 ));
		case 2:
			g2.draw(new Line2D.Double(x1, y1, x2, y2 ));
			g2.draw(new Line2D.Double(x2, y2, x3, y3 ));
			g2.draw(new Line2D.Double(x1, y1, x3, y3 ));
			
		}
	
	}

}
