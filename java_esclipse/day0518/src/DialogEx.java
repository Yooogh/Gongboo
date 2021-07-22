import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyDialog extends JDialog {
	private JTextField tf = new JTextField(10);//다이얼로그에 삽입할 텍스트 필드
	private JButton okButton = new JButton("OK");//다이얼로그에 삽입할 ok 버튼
	
	public MyDialog(JFrame frame, String title) {
		super(frame, title);
		setLayout(new FlowLayout());
		add(tf);
		add(okButton);
		setSize(200, 100);
		//다이얼로그의 ok에 action 리스터 달기
		//ok버튼이 선택되면 다이얼로그가 화면에서 사라지게 된다
		okButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);//다이얼로그를 보이지 않게 한다				
			}
		});
	}
}
public class DialogEx extends JFrame{
	private MyDialog dialog;//다이어로그의 레퍼런스
	public DialogEx() {
		super("DialogEx frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton btn = new JButton("Show dialog");
		//다이어롤그 생성
		dialog = new MyDialog(this, "Test Dialog");
		//show dialog 버튼을 선택하면 다이얼로그를 작동시킨다
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);//다이얼로그를 출력하고 작동시킨다
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
