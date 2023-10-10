import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Event2 extends JFrame{
    //JLabel 객체를 속성으로 등록
    JLabel jl;
    //JButton 객체를 속성으로 2개 등록
    JButton jb1,jb2;
    //생성자
    public Event2(){
        Container ct=getContentPane();
        ct.setLayout(new FlowLayout());

        jl=new JLabel("버튼을 누르세요");
        jb1=new JButton("안녕하세요");
        jb2=new JButton("행복한 하루입니다.");
        ct.add(jb1);
        ct.add(jb2);
        ct.add(jl);
        //3.이벤트를 받아들일 컴포넌트에 리스너 등록
        jb1.addActionListener(new EventProcess());
        jb2.addActionListener(new EventProcess());
        setSize(300,200);
        setTitle("Inner Test");
        setSize(300,200);

        setVisible(true);
        //창을 닫으면 프로그램 종료된다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    //1. 처리할 이벤트 종류 결정-ActionEvent
    //2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스 작성-ActionListener
    private class EventProcess implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //4.리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
            jl.setText(e.getActionCommand());
        }
    }



}




public class EventTest2 {
    public static void main(String[] args) {
    new Event2();
    }
}
