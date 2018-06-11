import java.awt.*;
import javax.swing.*;
public class ListEx extends JFrame{
	private String[] fruits={"apple","banana","kiwi","mango","pear","peach","berry","strawberry","blackberry"};
	public ListEx(){
		setTitle("리스트 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		JList<String> strList = new JList<String>(fruits);
		c.add(strList);
		
		JList<String> scrollList = new JList<String>(fruits);
		c.add(new JScrollPane(scrollList));
		
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ListEx();

	}

}
