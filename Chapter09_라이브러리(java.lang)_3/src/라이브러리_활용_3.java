import com.sist.music.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.swing.table.*;



public class 라이브러리_활용_3 extends JFrame implements ActionListener, MouseListener {
	JTextField tf;
	JButton b, b1;
	JTable table;
	DefaultTableModel model;
	
	public 라이브러리_활용_3() {
		tf = new JTextField(20);
		b = new JButton("검색");
		b1 = new JButton("목록");
		
		JPanel p = new JPanel();
		p.add(tf); p.add(b); p.add(b1);
		
		add("North", p);
		
		String[] col = {"번호", "노래명", "가수명"};
		String[][] row = new String[0][3];
		
		model = new DefaultTableModel(row, col) {
			// 익명의 클래스 => 상속 없이 오버라이딩이 가능하다.
			
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
			
		};
		table = new JTable(model);
		JScrollPane js = new JScrollPane(table);
		add("Center", js);
		
		musicData();
		setSize(500, 450);
		setVisible(true);
		
		b.addActionListener(this);
		b1.addActionListener(this);
		table.addMouseListener(this);
		
	}
	public void musicData() {
		// 목록을 누르면 리스트가 계속 생기기 때문에 목록 버튼을 누르면 전부 지우고 200개를 다시 출력.
		for (int i = model.getRowCount() - 1; i >= 0; i--) {	
			model.removeRow(i);
		}
		
		MusicSystem ms = new MusicSystem();
		Music[] music = ms.musicListData();
		
		for (Music m : music) {
			String[] data = {String.valueOf(m.getMno()), m.getTitle(), m.getSinger()};
			model.addRow(data);
			
		}
		
	}
	public void musicFindData(String fd) {
		for (int i = model.getRowCount() - 1; i >= 0; i--) {	
			model.removeRow(i);
		}
		MusicSystem ms = new MusicSystem();
		Music[] music = ms.musicFindData(fd);
	}
	public static void main(String[] args) {
//		MusicSystem ms = new MusicSystem();
		new 라이브러리_활용_3();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b) {
			// 입력한 값을 가져옵니다.
			String fd = tf.getText();
			if(fd.trim().length() < 1) {	// 입력이 안된 경우
				JOptionPane.showMessageDialog(this, "검색어를 입력하세요.");
				tf.requestFocus();
				return;	// 메서드 종료.
			}
			musicFindData(fd.trim());
	
		} else if (e.getSource() == b1) {
			musicData();
			
		}
	}
	@Override
	public void mouseClicked(MouseEvent e)  {
		if (e.getSource() == table) {
			if (e.getClickCount() == 2) {	// 더블클릭
				int row = table.getSelectedRow();
				String col = model.getValueAt(row, 0).toString();
				MusicSystem ms = new MusicSystem();
				Music music = ms.musicDetailData(Integer.parseInt(col));
				String msg = "노래명 : " + music.getTitle() + "\n"
							+ "가수명 : " + music.getSinger() + "\n"
							+ "앨범명 : " + music.getAlbum();
				JOptionPane.showMessageDialog(this, msg);
				try {
					Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
												+ "http://youtube.com/embed/" + music.getKey());
				} catch (Exception ex) {}
			}
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}

}

