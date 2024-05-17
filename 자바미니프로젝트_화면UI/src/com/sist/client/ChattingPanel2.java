/*
package com.sist.client;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class ChattingPanel2 extends JPanel {
    JButton b1, b2, b3; // 전송, 쪽지 보내기, 정보 보기 버튼
    JTextField inputField; // 채팅 입력 필드
    JTextArea chatArea; // 채팅 내용을 표시할 TextArea
    JTextArea userArea; // 유저 목록을 표시할 UserArea
    
    private ArrayList<String> userList; // 사용자 목록을 저장하는 ArrayList
    
    public ChattingPanel2() {
        // JFrame의 레이아웃을 null로 설정하여 직접 배치합니다.
        setLayout(null);
        
        // 사용자 목록을 저장할 ArrayList 초기화
        userList = new ArrayList<>();

        // 전송 버튼 초기화 및 위치 설정
        b1 = new JButton("전송");
        b1.setBounds(620, 700, 80, 30);
        add(b1);
        b2 = new JButton("쪽지 보내기");
        b2.setBounds(740, 410, 100, 30);
        add(b2);
        b3 = new JButton("정보 보기");
        b3.setBounds(860, 410, 100, 30);
        add(b3);


        // 채팅 입력 필드 초기화 및 위치 설정
        inputField = new JTextField();
        inputField.setBounds(10, 700, 610, 30);
        add(inputField);


        // 채팅 내용을 표시할 TextArea 초기화 및 위치 설정
        chatArea = new JTextArea();
        chatArea.setEditable(false); // 사용자가 직접 편집할 수 없도록 설정
        JScrollPane chatScrollPane = new JScrollPane(chatArea);
        chatScrollPane.setBounds(10, 100, 690, 580);
        add(chatScrollPane);
        
        // 유저 목록을 표시할 Area 초기화 및 위치 설정
        userArea = new JTextArea();
        userArea.setEditable(false);
        JScrollPane userScrollPane = new JScrollPane(userArea);
        userScrollPane.setBounds(700, 100, 300, 300);
        add(userScrollPane);
    
        // JFrame의 크기, 보이기 여부, 닫기 동작 설정
        setSize(1200, 800);
        setVisible(true);

     // 임의의 사용자 목록 추가
        addUser("원진");
        addUser("규혁");
        addUser("주희");
        addUser("제봉");
        addUser("연우");
        addUser("은영");
        addUser("제원");
        
    }
 // 사용자 추가 메서드
    public void addUser(String username) {
        userList.add(username);
        updateUsers(); // 사용자 목록 업데이트
    }

    // 사용자 제거 메서드
    public void removeUser(String username) {
        userList.remove(username);
        updateUsers(); // 사용자 목록 업데이트
    }

    // 사용자 목록 업데이트 메서드
    private void updateUsers() {
        // UserArea 업데이트
        userArea.setText(""); // 기존 내용 지우기
        for (String user : userList) {
            userArea.append(user + "\n"); // 사용자 목록 추가
        }
    }
}
*/
