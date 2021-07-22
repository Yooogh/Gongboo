import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyLabel extends JLabel {
	int barSize = 0;
	int maxBarSize;
	
	MyLabel(int maxBarSize) {
		this.maxBarSize =maxBarSize;
	}
	public void paintComponent(Graphics g) {
		super.paintCompoent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)this.getWidth()))
	}
}
public class TabAndThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
