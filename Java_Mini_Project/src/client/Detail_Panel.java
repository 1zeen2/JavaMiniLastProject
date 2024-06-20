package client;

import java.util.*;
import java.awt.*;
import java.net.*;
import javax.swing.*;

import commons.ImageChange;

public class Detail_Panel extends JFrame {
		JLabel la;
		
	public Detail_Panel () {
		setLayout(null);
		la = new JLabel();
		la.setBounds(341, 50, 683, 200);
		add(la);
		
		try {
			URL url = new URL("https://www.menupan.com/restaurant/restimg/004/zzmenuimg/h2017942_z.jpg");
			//													910 768
			Image img = ImageChange.getImage(new ImageIcon(url), 683, 400);
			la.setIcon(new ImageIcon(img));
		} catch (Exception ex) {}
		
    	setSize(1366, 768);
    	setResizable(false);
    	setVisible(true);
	}
	public static void main(String[] args) {
		new Detail_Panel();
	}
}
