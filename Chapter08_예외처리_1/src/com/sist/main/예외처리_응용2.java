package com.sist.main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // ActionListener 인터페이스를 사용하기 위해 임포트

public class 예외처리_응용2 extends JFrame implements ActionListener {
    // 윈도우를 상속하고 ActionListener를 구현하는 예외처리_응용2 클래스 선언

    JTextField tf; // 사용자 입력을 받는 텍스트 필드
    JButton b1, b2; // 시작과 종료 버튼
    JTextArea ta = new JTextArea(); // 게임 결과를 표시하는 텍스트 영역
    int[] com = new int[3]; // 컴퓨터가 생성한 난수
    int[] user = new int[3]; // 사용자가 입력한 숫자
    int s, b; // 스트라이크와 볼 개수를 나타내는 변수

    // 생성자
    public 예외처리_응용2() {
        tf = new JTextField();
        b1 = new JButton("시작");
        b2 = new JButton("종료");

        // 레이아웃 설정
        setLayout(null);

        // 텍스트 필드 배치 및 설정
        tf.setBounds(10, 15, 150, 30);
        tf.setEnabled(false);
        add(tf);

        // 시작 버튼 배치 및 설정
        b1.setBounds(165, 15, 100, 30);
        add(b1);

        // 종료 버튼 배치 및 설정
        b2.setBounds(270, 15, 100, 30);
        add(b2);

        // 텍스트 영역 설정
        ta.setEditable(false);
        JScrollPane js = new JScrollPane(ta); // 텍스트 영역을 스크롤 가능하도록 JScrollPane에 포함
        js.setBounds(10, 55, 360, 300); // JScrollPane 위치 및 크기 설정
        add(js);

        // 윈도우 설정
        setSize(400, 400);
        setVisible(true);

        // 버튼 클릭 이벤트 등록
        b1.addActionListener(this);
        b2.addActionListener(this);
        tf.addActionListener(this);
    }

    // main 메소드
    public static void main(String[] args) {
        new 예외처리_응용2(); // 생성자 호출
    }

    // 난수 생성 메소드
    public void getRand() {
        for (int i = 0; i < 3; i++) {
            com[i] = (int) (Math.random() * 9) + 1; // 1부터 9까지의 난수 생성
            for (int j = 0; j < i; j++) {
                if (com[j] == com[i]) {
                    i--; // 중복된 숫자가 발생할 경우 다시 난수 생성
                    break;
                }
            }
        }
    }

    // 스트라이크와 볼 비교 메소드
    public void compare() {
        s = 0;
        b = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (com[i] == user[j]) {
                    if (i == j)
                        s++; // 위치와 값이 모두 일치하면 스트라이크 증가
                    else
                        b++; // 값은 일치하지만 위치가 다르면 볼 증가
                }
            }
        }
        // 결과 출력
        String msg = "Input Number:" + user[0] + "" + user[1] + "" + user[2] + ",Result:" + s + "S-" + b + "B\n";
        ta.append(msg);

        // 정답인 경우 게임 종료 여부 확인
        if (s == 3) {
            int no = JOptionPane.showConfirmDialog(this, "종료할까요?", "종료", JOptionPane.YES_NO_OPTION);
            if (no == JOptionPane.YES_OPTION) {
                System.exit(0); // 종료
            } else {
                tf.setText("");
                tf.setEnabled(false);
                b1.setEnabled(true);
                ta.setText(""); // 텍스트 영역 초기화
            }
        }
    }

    // ActionListener 인터페이스의 actionPerformed 메소드 구현
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b2) {
            System.exit(0); // 종료 버튼 클릭 시 프로그램 종료
        } else if (e.getSource() == b1) {
            getRand(); // 시작 버튼 클릭 시 난수 생성
            JOptionPane.showMessageDialog(this, "게임을 시작합니다!!");
            tf.setEnabled(true);
            tf.requestFocus(); // 텍스트 필드에 포커스 설정
            b1.setEnabled(false); // 시작 버튼 비활성화
        } else if (e.getSource() == tf) {
            String no = tf.getText();
            try {
                int input = Integer.parseInt(no);
                // 입력값이 세 자리 정수인지 확인
                if (input < 100 || 999 < input) {
                    JOptionPane.showMessageDialog(this, "세자리 정수만 입력이 가능합니다!!");
                    tf.setText("");
                    tf.requestFocus();
                    return;
                }
                // 각 자리의 숫자를 배열에 저장
                user[0] = input / 100;
                user[1] = (input % 100) / 10;
                user[2] = input % 10;
                // 중복된 숫자가 있는지 확인
                if (user[0] == user[1] || user[0] == user[2] || user[1] == user[2]) {
                    JOptionPane.showMessageDialog(this, "중복된 수는 사용할 수 없습니다");
                    tf.setText("");
                    tf.requestFocus();
                    return;
                }
                // 0이 포함되어 있는지 확인
                if (user[0] == 0 || user[1] == 0 || user[2] == 0) {
                    JOptionPane.showMessageDialog(this, "0은 사용할 수 없습니다");
                    tf.setText("");
                    tf.requestFocus();
                    return;
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "정수만 가능합니다");
                tf.setText("");
                tf.requestFocus();
                return;
            }
            // 입력값 비교
            compare();
            tf.setText("");
            tf.requestFocus();
        }
    }
}

