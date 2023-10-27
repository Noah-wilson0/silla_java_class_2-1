package final1027;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

class JCheckBox1 extends JFrame implements ItemListener {
    JTextField jtf;
    public JCheckBox1(){
        //컨테이너 만들기
        Container ct=getContentPane();
        //체크 박스 4개 만들기
        JCheckBox jcb1=new JCheckBox("JSP");
        JCheckBox jcb2=new JCheckBox("PHP");
        JCheckBox jcb3=new JCheckBox("ASP");
        JCheckBox jcb4=new JCheckBox("Servlet");
        //JTextField만들기
        jtf=new JTextField(10);
        //레이아웃 적용
        ct.setLayout(new FlowLayout());
        //컨테이너에 체크박스, 텍스트필드 추가
        ct.add(jcb1);
        ct.add(jcb2);
        ct.add(jcb3);
        ct.add(jcb4);
        ct.add(jtf);
        //이벤트 리스너 설정
        jcb1.addItemListener(this);
        jcb2.addItemListener(this);
        jcb3.addItemListener(this);
        jcb4.addItemListener(this);

        setTitle("JCheckBox Test");
        setSize(250,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        //actionlistener도 사용가능
//        jtf.setText(e.getActionCommand());
        jtf.setText(((JCheckBox)e.getItem()).getText());
    }
}

public class JCheckBoxTest1 {
    public static void main(String[] args) {
        new JCheckBox1();
    }
}
