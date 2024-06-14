package test1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// CellClickExample 클래스 선언 및 JFrame을 상속
public class CellClickExample extends JFrame {
    // 6x7 크기의 JButton 배열 선언
    private JButton[][] cells = new JButton[6][7];

    // 생성자
    public CellClickExample() {
        // 프레임 제목 설정
        setTitle("Cell Click Example");
        // 프레임 종료 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 프레임 크기 설정
        setSize(400, 400);
        // 그리드 레이아웃 설정
        setLayout(new GridLayout(6, 7));

        // 셀 생성 및 이벤트 처리
        for (int i = 0; i < 6; i++) { // 행 반복
            for (int j = 0; j < 7; j++) { // 열 반복
                // JButton 생성 및 좌표 표시
                cells[i][j] = new JButton("(" + i + ", " + j + ")");
                // 프레임에 버튼 추가
                add(cells[i][j]);
                // 마우스 이벤트 처리를 위한 MouseAdapter 등록
                int finalI = i; // 클로저 내부에서 접근하기 위한 변수
                int finalJ = j; // 클로저 내부에서 접근하기 위한 변수
                cells[i][j].addMouseListener(new MouseAdapter() {
                    @Override
                    // 마우스 클릭 이벤트 처리
                    public void mouseClicked(MouseEvent e) {
                        // 상위 클래스의 mouseClicked 메서드 호출
                        super.mouseClicked(e);
                        // 셀 클릭 시 메시지 출력
                        JOptionPane.showMessageDialog(CellClickExample.this,
                                "Cell clicked: (" + finalI + ", " + finalJ + ")");
                    }
                });
            }
        }
    }

    // main 메서드
    public static void main(String[] args) {
        // GUI 코드는 이벤트 디스패치 스레드에서 실행해야 함
        SwingUtilities.invokeLater(() -> {
            // CellClickExample 객체 생성 및 표시
            CellClickExample example = new CellClickExample();
            example.setVisible(true);
        });
    }
}
