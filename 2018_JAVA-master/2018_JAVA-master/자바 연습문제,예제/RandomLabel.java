import javax.swing.*;
import java.awt.*;
public class RandomLabel extends JFrame{
	public RandomLabel(){
		setTitle("Random squal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		Container c=getContentPane();
		c.setLayout(null);
		
		for(int j = 0 ;j<20;j++){
			int x=(int)(Math.random()*200)+50;
			int y=(int)(Math.random()*200)+50;
			JLabel la = new JLabel();
			la.setLocation(x,y);
			la.setSize(10,10);
			la.setOpaque(true);
			la.setBackground(Color.blue);
			c.add(la);
		}
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		RandomLabel a = new RandomLabel();

	}

}
