import java.awt.*;
import javax.swing.*;

public class Many extends JFrame{
	public Many(){
	setTitle("여러 개의 패널을 가진 프레임");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	Container every = getContentPane();
	JPanel header = new JPanel();
	JPanel body = new JPanel();
	JPanel footer = new JPanel();
	
	every.add(header,BorderLayout.NORTH);
	every.add(body,BorderLayout.CENTER);
	every.add(footer,BorderLayout.SOUTH);
	
	header.setBackground(Color.GRAY);
	header.setLayout(new FlowLayout());
	header.add(new JButton("열기"));
	header.add(new JButton("닫기"));
	header.add(new JButton("나가기"));
	
	body.setBackground(Color.white);
	body.setLayout(null);
	
	for(int j = 0 ;j<10;j++){
		int y=(int)(Math.random()*200);
		int x=(int)(Math.random()*200);
		JLabel la = new JLabel();
		la.setLocation(x,y);
		la.setSize(10,10);
		la.setBackground(Color.WHITE);
		la.setOpaque(true);
		la.setText("*");
		la.setForeground(Color.red);
		body.add(la);
	}
		footer.setBackground(Color.yellow);
		footer.setLayout(new FlowLayout());
		footer.add(new JButton("Word Input"));
		footer.add(new JTextField(15));
		
		setSize(300,350);
		setVisible(true);
	
	}
	public static void main(String[] args) {
		Many k = new Many();

	}

}
