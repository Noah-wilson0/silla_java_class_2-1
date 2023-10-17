import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

class GUI2 extends JFrame implements ActionListener{
    //속성으로 선언
    JTextArea jta;
    JTextField jtf;

    //생성자
    public GUI2() {
        Container ct = getContentPane();
        ct.setLayout(new FlowLayout());
        //여러줄 텍스트 출력-10중 20자
        jta = new JTextArea( 10, 20);
        //한줄 텍스트 작성 -파일명 입력
        jtf = new JTextField(20);
        JPanel pl = new JPanel();
        //버튼 객체 생성-객체생성
        JButton bt = new JButton("파일 읽어오기");
        jta.setEditable(false);
        pl.add(jtf);
        pl.add(bt);
        ct.add(pl);
        ct.add(jta);
        setTitle("GUI Test2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
        //1.처리할 이벤트 종류 경정-ActionEvent
        //2.이벤트에 적합한 이벤트 리스너 인터페이스를 사용하여 클래스 작성-ActionListener
        bt.addActionListener(this);

    }
    //4.리스너 인터페이스에 선언된 메소드를 오버라이딩하여 이벤트 처리 루틴 작성
    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            //입출력을 위한 예외처리
            //파일 이름으로 출력 객체 생성.
            String s = jtf.getText();
            FileInputStream fis=new FileInputStream(s);
            DataInputStream dos=new DataInputStream(fis);
            //텍스트 에어리어의 내용을 파일로 출력
            jta.setText(dos.readUTF());
            fis.close();
            System.out.println(s + "파일 읽기 완료");
        } catch (IOException ex) {
            System.out.println("파일 읽기 실패");
        }
    }
}
public class GUITest2 {
    public static void main(String[] args) {
        new GUI2();
    }
}
