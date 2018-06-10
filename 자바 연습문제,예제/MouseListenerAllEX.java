import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MouseListenerAllEX extends JFrame{
	private JLabel la = new JLabel("No Mouse Event");
	public MouseListenerAllEX(){
		setTitle("MouseListener¿Í MouseMotionListener");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.add(la);
		setSize(300,200);
		setVisible(true);
	}
	class MyMouseListener implements MouseListener,MouseMotionListener{

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDragged("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMoved("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.CYAN);
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Component c = (Component)e.getSource();
			c.setBackground(Color.YELLOW);
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePressed("+e.getX()+","+e.getY()+")");
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseReleased("+e.getX()+","+e.getY()+")");
			
		}
		
	}
	public static void main(String[] args) {
		new MouseListenerAllEX();

	}

}
