import javax.swing.*;
import java.awt.*;

class JPanel2 extends JFrame{
    public JPanel2(){
        Container ct= getContentPane();
        // 배치 관리자 설정 BorderLayout
        BorderLayout b1= new BorderLayout(5,5);

        //판넬1 객체 생성
        JPanel jp1=new JPanel();
        //판넬1에 그리드 배치 관리 설정...5줄 1칸
        jp1.setLayout(new GridLayout(5,1));

        //판넬1에 라디오 버튼 추가
        jp1.add(new JRadioButton("자바"));
        jp1.add(new JRadioButton("C언어"));
        jp1.add(new JRadioButton("JAVA SCRIPT"));
        jp1.add(new JRadioButton("JSP"));
        jp1.add(new JRadioButton("C#"));

        //판넬2 객체 생성
        JPanel jp2=new JPanel();
        //판넬1에 그리드 배치 관리 설정...5줄 1칸
        jp2.setLayout(new GridLayout(5,1));

        //판넬2에 라디오 버튼 추가
        jp2.add(new JButton("자바"));
        jp2.add(new JButton("C언어"));
        jp2.add(new JButton("JAVA SCRIPT"));
        jp2.add(new JButton("JSP"));
        jp2.add(new JButton("C#"));

        //판넬3 객체 생성
        JPanel jp3=new JPanel();
        //판넬1에 그리드 배치 관리 설정...5줄 1칸
        jp2.setLayout(new GridLayout(1,1));

        ct.add(jp1,BorderLayout.WEST);
        ct.add(jp2,BorderLayout.CENTER);
        ct.add(jp3,BorderLayout.NORTH);
        jp3.add(new JLabel("좋아하는 프로그래밍 언어를 선택하세요."));


        setTitle("JPanel Test2");
        setSize(300,200);
        setVisible(true);

        //창을 닫으면 프로그램 종료된다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


public class JPanelTest2 {
    public static void main(String[] args) {

        new JPanel2();

    }
}
