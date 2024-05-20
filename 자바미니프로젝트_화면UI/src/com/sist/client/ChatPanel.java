package com.sist.client;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ChatPanel extends JPanel implements ActionListener {
    JTable table1, table2;
    DefaultTableModel model1, model2;
    JTextPane pane;
    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6;
    JScrollBar bar;
    JComboBox<String> box = new JComboBox<String>();

    public ChatPanel() {
        setLayout(null);

        // 첫 번째 테이블 설정
        String[] col1 = {"방 이름", "상태", "인원"};
        String[][] row1 = new String[0][3];
        model1 = new DefaultTableModel(row1, col1);
        table1 = new JTable(model1);
        JScrollPane js1 = new JScrollPane(table1);
        js1.setBounds(10, 15, 350, 500);
        add(js1);

        // 두 번째 테이블 설정 (채팅 내용 테이블로 추정)
        String[] col2 = {"사용자", "메시지"};
        String[][] row2 = new String[0][2];
        model2 = new DefaultTableModel(row2, col2);
        table2 = new JTable(model2);
        JScrollPane js2 = new JScrollPane(table2);
        js2.setBounds(380, 15, 380, 500);
        add(js2);

        // 색상 선택 콤보 박스
        box.addItem("black");
        box.addItem("blue");
        box.addItem("green");
        box.addItem("magenta");
        box.addItem("pink");
        box.addItem("cyan");
        box.addItem("orange");
        box.setBounds(610, 560, 150, 30);
        add(box);

        // 버튼들 초기화 및 배치
        b1 = new JButton("방만들기");
        b2 = new JButton("방 들어가기");
        b3 = new JButton("쪽지 보내기");
        b4 = new JButton("정보 보기");
        b5 = new JButton("보류");
        b6 = new JButton("방 삭제");

        b1.setBounds(10, 600, 150, 30);
        b2.setBounds(160, 600, 150, 30);
        b3.setBounds(280, 600, 150, 30);
        b4.setBounds(390, 600, 150, 30);
        b5.setBounds(500, 600, 150, 30);
        b6.setBounds(610, 600, 150, 30);

        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);

        // 액션 리스너 등록
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            // 방 만들기 버튼 로직
            String roomTitle = JOptionPane.showInputDialog(this, "방 제목을 입력하세요:", "방 만들기", JOptionPane.PLAIN_MESSAGE);

            if (roomTitle != null && !roomTitle.trim().isEmpty()) {
                // 방 제목이 유효하면 테이블에 새 방 추가
                String[] newRow = {roomTitle, "대기 중", "1"};  // 기본 상태와 인원을 설정
                model1.addRow(newRow);
                System.out.println("새 방 제목: " + roomTitle);

                // 방에 입장하는 로직 실행
                int lastRow = model1.getRowCount() - 1;
                table1.setRowSelectionInterval(lastRow, lastRow);  // 새로 추가된 방을 선택
                enterRoom(roomTitle);
            } else {
                System.out.println("유효한 방 제목을 입력하세요.");
            }
        } else if (e.getSource() == b2) {
            // 방 들어가기 버튼 로직
            int selectedRow = table1.getSelectedRow();
            if (selectedRow != -1) {
                String roomTitle = (String) model1.getValueAt(selectedRow, 0);
                enterRoom(roomTitle);
            } else {
                System.out.println("방을 선택하세요.");
            }  
        } else if (e.getSource() == b3) {
            // 쪽지 보내기 버튼 로직
            System.out.println("쪽지 보내기 버튼 클릭");
        } else if (e.getSource() == b4) {
            // 정보 보기 버튼 로직
            System.out.println("정보 보기 버튼 클릭");
        } else if (e.getSource() == b5) {
            // 보류 버튼 로직
            System.out.println("보류 버튼 클릭");
        } else if (e.getSource() == b6) {
            // 방 삭제 버튼 로직
            int selectedRow = table1.getSelectedRow();
            if (selectedRow != -1) {
                // 선택된 행이 있는 경우
                model1.removeRow(selectedRow);
                System.out.println("선택된 방이 삭제되었습니다.");
            } else {
                // 선택된 행이 없는 경우
                JOptionPane.showMessageDialog(this, "삭제할 방을 선택하세요.", "오류", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void enterRoom(String roomTitle) {
        // 방에 입장하는 로직을 여기에 구현합니다.
        System.out.println("방에 입장: " + roomTitle);
        // 여기서 추가적인 방 입장 로직을 구현할 수 있습니다.
    }
}

