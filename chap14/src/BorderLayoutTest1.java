import javax.swing.*;
import java.awt.*;

class BorderLayout1 extends JFrame {
    public BorderLayout1(){
        //프레임으로부터 컨테이너 생성
        Container ct= getContentPane();
        //BorderLayout 배치 관리자 객체 생성
        BorderLayout b1= new BorderLayout(10,10);

        //컨테이너에 레이아웃 설정.
        ct.setLayout(b1);

        //5개의 버튼을 배치
        ct.add(new JButton("오른쪽 버튼"),BorderLayout.EAST);
        ct.add(new JButton("왼쪽 버튼"),BorderLayout.WEST);
        ct.add(new JButton("위 버튼"),BorderLayout.NORTH);
        ct.add(new JButton("아래쪽 버튼"),BorderLayout.SOUTH);
        ct.add(new JButton("중앙쪽 버튼"),BorderLayout.CENTER);

        setTitle("BorderLayout Test");
        setSize(400,300);
        setVisible(true);

        //창을 닫으면 프로그램 종료된다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        }





public class BorderLayoutTest1 {
    public static void main(String[] args) {
        new BorderLayout1();
    }
}
