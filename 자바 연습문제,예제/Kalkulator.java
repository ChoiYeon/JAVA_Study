import javax.swing.*;
import java.awt.*;
public class Kalkulator extends JFrame{
	public Kalkulator(){
		setTitle("계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container every = getContentPane();
		JPanel header = new JPanel();
		JPanel body = new JPanel();
		JPanel footer = new JPanel();
		every.add(header,BorderLayout.NORTH);
		every.add(body,BorderLayout.CENTER);
		every.add(footer,BorderLayout.SOUTH);
		header.setBackground(Color.gray);
		header.setLayout(new FlowLayout());
		
		header.add(new JLabel("수식입력"));
		header.add(new JTextField(15));
		GridLayout grid = new GridLayout(4,4,5,5);
		body.setLayout(grid);
		for(int i=0;i<10;i++){
			JButton b = new JButton();
			body.add(new JButton(Integer.toString(i)));
		}
		body.add(new JButton("CE"));
		body.add(new JButton("계산"));
		body.add(new JButton("+")).setBackground(Color.magenta);
		body.add(new JButton("-")).setBackground(Color.magenta);;
		body.add(new JButton("x")).setBackground(Color.magenta);;
		body.add(new JButton("/")).setBackground(Color.magenta);;
		
		footer.setBackground(Color.YELLOW);
		footer.setLayout(new FlowLayout());
		footer.add(new JLabel("계산결과"));
		footer.add(new JTextField(15));
		
		setSize(350,350);
		setVisible(true);
	}
	public static void main(String[] args) {
		Kalkulator k = new Kalkulator();

	}

}
