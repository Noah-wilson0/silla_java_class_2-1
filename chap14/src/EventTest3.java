import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
    독립된 이벤트 처리 클래스를 이용한 이벤트 처리
 */
//이번트 처리 클래스
class EventClass implements ActionListener {
    JLabel jl;
    //생성자를 통해 JLabel객체 공유
    public EventClass(JLabel jl){
        this.jl=jl;
    }
    //4.리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
    @Override
    public void actionPerformed(ActionEvent e) {
        jl.setText(e.getActionCommand());
    }
}
//GUI 클래스- 버튼 2개와 레이블 1개
class Event3 extends JFrame{
    //JLabel 객체를 속성으로 등록
    JLabel jl;
    //JButton 객체를 속성으로 2개 등록
    JButton jb1,jb2;
    //생성자
    public Event3() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());

        jl = new JLabel("버튼을 누르세요");
        jb1 = new JButton("안녕하세요");
        jb2 = new JButton("행복한 하루입니다.");
        ct.add(jb1);
        ct.add(jb2);
        ct.add(jl);
        //3.이벤트를 받아들일 컴포넌트에 리스너 등록
        jb1.addActionListener(new EventClass(jl));
        jb2.addActionListener(new EventClass(jl));
        setSize(300, 200);
        setTitle("Inner Test");
        setSize(300, 200);

        setVisible(true);
        //창을 닫으면 프로그램 종료된다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class EventTest3 {
    public static void main(String[] args) {
        new Event3();
    }
}
