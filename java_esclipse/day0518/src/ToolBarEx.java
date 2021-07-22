import java.awt.*;
import javax.swing.*;

public class ToolBarEx extends JFrame{
	private Container contentPane;
	public ToolBarEx() {
		setTitle("make ToolBar");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400, 200);
		setVisible(true);
	}
	
	private void createToolBar() {
		JToolBar toolBar = new JToolBar("Kitae Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("image/image.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("image")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		
		JComboBox combo =new JComboBox();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		contentPane.add(toolBar, BorderLayout.NORTH);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolBarEx();
	}
}
