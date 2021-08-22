import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyModalDialog extends JDialog {
	private JTextField tf = new JTextField(10);
	private JButton okButton = new JButton("OK");
	
	public MyModalDialog(JFrame frame, String title) {
		super(frame,title, true); // ��� ���̾�α׷� ���� //����� ����Ʈ�� true ���� ����
		//true�� ��� Ÿ���� ���鵵�� ���� false�� ��޸��� ���� ����â�� �������ְԵ�
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);

		okButton.addActionListener(new ActionListener() {//���̾�α�â ����
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
	}

	public String getInput() {
		if(tf.getText().length() == 0) return null;
		else return tf.getText();
	}
}
public class DialogEx2 extends JFrame {
	private MyModalDialog dialog;//���̾�α��� ���۷���
 	public DialogEx2() {
		super("DialogEx2 ���� ������");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn  = new JButton("Show Modal Dialog");//������ ����
		//��� ���̾�α� ����
		dialog = new MyModalDialog(this, "Test Modal Dialog");

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);//��� ���̾�α� �۵� ����
				//���̾�α׺��� ����ڰ� �Է��� ���ڿ��� �޾� �´�
				
				String text = dialog.getInput();
				//���̾�α׿� ��ǲ�� �ؽ�Ʈ�� text�� ��Ƽ� �޾ƿ�

				if(text == null) return;//�Է��� ���ڿ��� ���� ���, �׳� ����
				JButton btn = (JButton)e.getSource();
				btn.setText(text);//�Է��� ���ڿ��� �� ��ư�� ���ڿ��� �����Ѵ�
			}
		});
		getContentPane().add(btn);
		setSize(250,200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new DialogEx2();
	}
}
