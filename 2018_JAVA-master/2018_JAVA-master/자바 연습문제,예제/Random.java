import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Random extends JFrame{
	JLabel label = new JLabel("c");
	public Random(){
		setTitle("Random teleport");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		label.addMouseListener(new MyMouseListener());
		label.setLocation(100,100);
		label.setSize(20,20);
		
		c.add(label);
		setSize(300,300);
		setVisible(true);
	}
	class MyMouseListener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			JLabel la = (JLabel)e.getSource();
			 int x =(int)(Math.random()*250);
			 int y =(int)(Math.random()*250);
			
			
			label.setLocation(x,y);
		}
		

		
	}

		public static void main(String[] args) {
			new Random();

		}

	}	
	
	
