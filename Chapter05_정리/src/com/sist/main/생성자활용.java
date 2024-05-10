package com.sist.main;

import javax.swing.*;

public class 생성자활용 {
	JFrame frame = new JFrame();
	
	public 생성자활용(String title) 
	{
		frame = new JFrame();
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
/*	
 * public 생성자활용() 
	{
		frame.setSize(800, 600);
		frame.setVisible(true);
	}
*/

	public static void main(String[] args) {
		new 생성자활용("Music");

	}

}
