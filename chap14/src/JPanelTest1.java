import javax.swing.*;
import java.awt.*;

class JPanel1 extends JFrame{
    public JPanel1(){
        //프레임으로부터 컨테이너 생성
        Container ct= getContentPane();

        //배치관리자 설정. FlowLayout
        ct.setLayout(new FlowLayout());

        //컨테이너에 컴포넌트 추가(쟁반)
        ct.add(new JRadioButton("자바"));
        ct.add(new JRadioButton("C언어"));
        ct.add(new JRadioButton("JAVA SCRIPT"));
        ct.add(new JRadioButton("JSP"));
        ct.add(new JRadioButton("C#"));

        ct.add(new JButton("자바"));
        ct.add(new JButton("C언어"));
        ct.add(new JButton("JAVA SCRIPT"));
        ct.add(new JButton("JSP"));
        ct.add(new JButton("C#"));


        setTitle("JPanel Test");
        setSize(300,200);
        setVisible(true);

        //창을 닫으면 프로그램 종료된다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class JPanelTest1 {
    public static void main(String[] args) {
        new JPanel1();
    }
}
