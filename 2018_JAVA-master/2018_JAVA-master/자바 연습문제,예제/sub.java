import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class sub extends JFrame {
		private String text="Java Love";
		
		public sub(){
			setTitle("SubString ¿Ã∫•∆Æ");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Container c = getContentPane();
			c.setLayout(new FlowLayout());
			c.setFocusable(true);
			c.requestFocus();
			JLabel la = new JLabel(text);
			c.add(la);
			c.addKeyListener(new KeyListener() {
		

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					if(e.getKeyCode()==KeyEvent.VK_LEFT)
						 text=text.substring(1)+text.substring(0,1);
					la.setText(text);
					
				}
			});
			
			setSize(300,300);
			setVisible(true);
		}

	public static void main(String[] args) {
		new sub();

	}

}
