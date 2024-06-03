package mini.test.copy;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

public class Scheduler_copy extends JPanel {
    JButton inBtn;
    JLabel titleLa;
    JTable table;
    DefaultTableModel model; 
    TableColumn column;

    public Scheduler_copy() {
        inBtn = new JButton("검색");
        titleLa = new JLabel("게시판", JLabel.CENTER);
        titleLa.setFont(new Font("맑은 고딕", Font.BOLD, 30));

        String[] col = {"일", "월", "화", "수", "목", "금", "토"};
        String[][] row = new String[6][7]; // 6행 7열로 변경

        // 데이터 관리
        model = new DefaultTableModel(row, col) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        table = new JTable(model);

        // 헤더 제거
        table.setTableHeader(null);

        for (int i = 0; i < col.length; i++) {
            column = table.getColumnModel().getColumn(i);
            column.setPreferredWidth(150);
        }

        // 첫 번째 행의 높이를 30으로 설정
        table.setRowHeight(0, 30);

        // 나머지 행의 높이를 105로 설정
        for (int i = 1; i < table.getRowCount(); i++) {
            table.setRowHeight(i, 105);
        }

        // 첫 번째 열의 셀을 연한 분홍색으로 설정하고, 가운데 정렬하는 렌더러 추가
        TableCellRenderer cellRenderer = new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                                                           boolean isSelected, boolean hasFocus,
                                                           int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                if (column == 0) { // 첫 번째 열인 경우
                    c.setBackground(new Color(255, 182, 193)); // 연한 분홍색
                    ((JLabel) c).setHorizontalAlignment(CENTER); // 가운데 정렬
                } else {
                    c.setBackground(table.getBackground());
                }
                return c;
            }
        };
        table.getColumnModel().getColumn(0).setCellRenderer(cellRenderer);

        JScrollPane js = new JScrollPane(table);

        // 배치
        setLayout(null);

        // titleLa를 패널 중앙에 배치
        Dimension titleSize = titleLa.getPreferredSize();
        titleLa.setBounds((1366 - titleSize.width) / 2, 15, titleSize.width, 50);
        add(titleLa);
        inBtn.setBounds(1200, 100, 100, 30);
        add(inBtn);
        js.setBounds(350, 150, 975, 558);
        add(js);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Scheduler List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1366, 768);
        frame.add(new Scheduler_copy());
        frame.setVisible(true);
    }
}
