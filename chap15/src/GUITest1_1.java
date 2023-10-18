import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


class GUI1_1 extends JFrame{
    //속성으로 선언
    JTextArea jta;
    JTextField jtf;

    //생성자
    public GUI1_1() {

        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        //여러줄 텍스트 생성-10중 20자
        jta = new JTextArea("텍스트 입력", 10, 20);
        //한줄 텍스트 작성 -파일명 입력
        jtf = new JTextField(20);
        JPanel pl = new JPanel();
        //버튼 객체 생성-객체생성
        JButton bt = new JButton("파일로 저장");
        pl.add(jtf);
        pl.add(bt);
        ct.add(jta);
        ct.add(pl);
        setTitle("GUI Test");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        //1.처리할 이벤트 종류 경정-ActionEvent
        //2.이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성-ActionListener
        bt.addActionListener(new EventClass2(jta,jtf));

    }
}
class EventClass implements ActionListener {
    //4.리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
    //독립된 이벤트 처리 클래스
    JTextArea jta;
    JTextField jtf;
    public EventClass(JTextArea jta,JTextField jtf){
        this.jta=jta;
        this.jtf=jtf;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //입출력을 위한 예외처리
            //파일 이름으로 출력 객체 생성.
            String s = jtf.getText();
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);
            //텍스트 에어리어의 내용을 파일로 출력
            dos.writeUTF(jta.getText());
            fos.close();
            System.out.println(s + "파일 생성 완료");
        } catch (IOException ex) {
            System.out.println("파일 생성실패");
        }
    }
}

public class GUITest1_1 {
    public static void main(String[] args) {
        new GUI();
    }
}
