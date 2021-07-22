import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);//���̾�α׿� ������ �ؽ�Ʈ �ʵ�
	private JButton okButton = new JButton("OK");//���̾�α׿� ������ ok ��ư
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		//���̾�α��� ok�� action ������ �ޱ�
		//ok��ư�� ���õǸ� ���̾�αװ� ȭ�鿡�� ������� �ȴ�
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);//���̾�α׸� ������ �ʰ� �Ѵ�				
			}
		});
	}
}
public class DialogEx extends JFrame{
	private MyDialog dialog;//���̾�α��� ���۷���
	public DialogEx() {
		super("DialogEx frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show dialog");
		//���̾�ѱ� ����
		dialog = new MyDialog(this, "Test Dialog");
		//show dialog ��ư�� �����ϸ� ���̾�α׸� �۵���Ų��
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);//���̾�α׸� ����ϰ� �۵���Ų��
			}
		});
		getContentPane().add(btn);
		setSize(250, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DialogEx();
	}
}
