package kh.java.gui.swing.container.layout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import kh.java.gui.util.MyUtil;

public class NullLayoutTest extends JFrame{

	private JTextField id;
	private JPasswordField pwd;
	
	public NullLayoutTest(int w, int h, String title) {

		MyUtil.init(this, w, h, title);
	
		//layout 무효화
		setLayout(null);
		
		JLabel labelId = new JLabel("아이디 : ");
		labelId.setBounds(50, 100, 60, 50);
		
		id = new JTextField();
		id. setBounds(110,100,200,50);
		
		JLabel labelPwd = new JLabel("비밀번호 : ");
		labelPwd.setBounds(50,160,60,50);
		
		pwd = new JPasswordField();
 		pwd.setBounds(110,160,200,50);
		
 		JButton button = new JButton("로그인");
 		button.setBounds(330, 100, 100, 110);
 		
 		//사용자 로그인버튼을 클릭했을때, 입력한id. pwd값를 가져오기
 		//사용자Event + EventHandling 
 		//1. 이벤트처리객체 생성(클래스 작성)
 		//2.buttom컴포넌트와 연결(binding)
 		
 		button.addActionListener(new LoginBtnListener()); //JButton의 ActionEvent가 발생시 자동호출
 		
		add(labelId);
		add(id);
		add(labelPwd);
		add(pwd);
		add(button);
		
	}
	
	/**
	 * JButton용 action event handler클래스 작성
	 * 
	 * event handler
	 * event listener ->구현야하는 부모 클래스 = ActionListener
	 * 
	 */
	
	public class LoginBtnListener implements ActionListener {
		
		/**
		 * JButton의 ActionEvent가 발생시 자동호출되는 메소드
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
//			System.out.println("버튼을 클릭하셨습니다.");
			//사용자 입력 id,password 가져오기
			System.out.println("id : "+id.getText());
										//패스워드의 사용방식 : char[]배열로 가져와서 스트링 객체
			System.out.println("pwd : "+new String(pwd.getPassword()));
			
		}
		
	}
	
	public static void main(String[] args) {
		new NullLayoutTest(500, 500, "로그인").setVisible(true);
	}
	
}
