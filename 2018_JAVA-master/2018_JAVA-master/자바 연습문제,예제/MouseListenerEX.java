import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MouseListenerEX extends JFrame {
	private JLabel la = new JLabel("Hello");
	public MouseListenerEX(){
		setTitle("CLICK!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.addMouseListener(new MyMouseListener());
		c.setLayout(null);
		
		
		la.setSize(30,10);
		la.setLocation(100,100);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class MyMouseListener implements MouseListener{
		public void mousePressed(MouseEvent e) {
			int x=e.getX();
			int y=e.getY();
			la.setLocation(x,y);
			
		}
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

	
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}


	
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		
	}

	

	public static void main(String[] args) {
		new MouseListenerEX();

	}

}
