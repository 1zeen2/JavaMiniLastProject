package client;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JFrame {
	Image back;
	JLabel idLa, pwdLa;
	JTextField tf;
	JPasswordField pf;
	JButton loginBtn, joinBtn, cancelBtn;
	// 스킨 => 이미지배경 =>
//@Override
//	protected void paintComponent(Graphics g) {
//		// TODO Auto-generated method stub
//		g.drawImage(back,0,0,getWidth(),getHeight(),this);
//	}

    public LoginPanel()
    {
	       back=Toolkit.getDefaultToolkit().getImage("C:\\Users\\user\\Documents\\카카오톡 받은 파일\\Scheduler_Image.jpg");
	       
	       setContentPane(new JPanel(){
	          
	          @Override
	          protected void paintComponent(Graphics g) {
	             super.paintComponent(g);
	             g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	          }
	       });

		idLa = new JLabel("아이디", JLabel.RIGHT);
		pwdLa = new JLabel("비밀번호", JLabel.RIGHT);

		tf = new JTextField();
		pf = new JPasswordField();

		loginBtn = new JButton("로그인");
		joinBtn = new JButton("회원가입");
		cancelBtn = new JButton("종료");

		// 배치
		setLayout(null);
		idLa.setBounds(750, 545, 80, 30);
		tf.setBounds(835, 545, 180, 30);
		add(idLa);
		add(tf);

		pwdLa.setBounds(750, 580, 80, 30);
		pf.setBounds(835, 580, 180, 30);
		add(pwdLa);
		add(pf);

		JPanel p = new JPanel();
		p.add(loginBtn);
		p.add(joinBtn);
		p.add(cancelBtn);
		p.setOpaque(false);

		p.setBounds(785, 620, 265, 35);
		add(p);

		setSize(1366, 768);
		setVisible(true);
	}
}