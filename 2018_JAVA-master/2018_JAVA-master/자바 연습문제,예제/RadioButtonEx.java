import java.awt.*;
import javax.swing.*;
public class RadioButtonEx extends JFrame{
	public RadioButtonEx(){
		setTitle("체크박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon one = new ImageIcon("images/1.jpg");
		ImageIcon selectone = new ImageIcon("images/2.jpg");
		
		ButtonGroup g= new ButtonGroup();

		JCheckBox apple = new JCheckBox("사과");
		JCheckBox cherry = new JCheckBox("배",true);
		JCheckBox one1 = new JCheckBox("원!",one);
		
		one1.setBorderPainted(true);
		one1.setSelectedIcon(selectone);
		
		
		g.add(apple);
		g.add(cherry);
		g.add(one1);
		
		add(apple);
		add(cherry);
		add(one1);
		
		setSize(250,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		new RadioButtonEx();

	}

}
