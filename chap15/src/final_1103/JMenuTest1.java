package final_1103;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JMenu1 extends JFrame implements ActionListener {
    JTextField jtf; //선택한 메뉴 출력
    JMenu1() {
        //컨테이너 생성
        Container ct = getContentPane();
        //레이아웃
        ct.setLayout(new BorderLayout());
        //1.JMenuBar() 객체 생성
        JMenuBar jmb=new JMenuBar();
        //2.JMenu 객체 생성
         JMenu menu1=new JMenu("파일");
         JMenu menu2=new JMenu("편집");
         //3. JMenuItem 서브 메뉴 객체로 생성
        JMenuItem jmi=new JMenuItem("새 파일");
        jmi.addActionListener(this);
        menu1.add(jmi);

        jmi=new JMenuItem("저장하기");
        jmi.addActionListener(this);
        menu1.add(jmi);

        jmi=new JMenuItem("열기");
        jmi.addActionListener(this);
        menu2.add(jmi);

        jmi=new JMenuItem("잘라내기");
        jmi.addActionListener(this);
        menu2.add(jmi);

        jmi=new JMenuItem("복사");
        jmi.addActionListener(this);
        menu2.add(jmi);
        //3. JCheckBoxMenuItem 서브 메뉴 객체로 생성
        JCheckBoxMenuItem jcbi=new JCheckBoxMenuItem("열기");
        jcbi.addActionListener(this);
        menu2.add(jcbi);
        //3. JRadioButtonMenuItem 서브 메뉴 객체로 생성
        JRadioButtonMenuItem jrbmi=new JRadioButtonMenuItem();
        jrbmi.addActionListener(this);
        menu2.add(jrbmi);

        //5.menu1,menu2 를 jmb(JMenuBar)에 추가
        jmb.add(menu1);
        jmb.add(menu2);

        //6.setMenuBar()에 메서드를 이용하여 메뉴바를 프레임에 추가
        setJMenuBar(jmb);

        jtf=new JTextField();
        ct.add(jtf,BorderLayout.SOUTH); ///textfield 위치 설정.

        //화면 출력
        setTitle("JMenuTest1");
        setSize(300,200);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        jtf.setText(e.getActionCommand());
    }
}

public class JMenuTest1 {
    public static void main(String[] args) {
        new JMenu1();
    }
}
