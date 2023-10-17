import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JButton2 extends JFrame implements ActionListener{
    JTextField jtf;
    public JButton2() {
        jtf = new JTextField();
        ImageIcon apple = new ImageIcon("image/apple.jpg");
        ImageIcon banana = new ImageIcon("image/banana.jpg");
        ImageIcon persimmom = new ImageIcon("image/persimmom.jpg");
        ImageIcon pear = new ImageIcon("image/pear.jpg");
        ImageIcon grape = new ImageIcon("image/grape.jpg");

        JButton jb1 = new JButton("사과", apple);
        JButton jb2 = new JButton("바나나", banana);
        JButton jb3 = new JButton("감", persimmom);
        JButton jb4 = new JButton("배", pear);
        JButton jb5 = new JButton("포도", grape);

        //컨테이너 생성.
        Container ct = getContentPane();
        //FlowLayout 생성
        ct.setLayout(new GridLayout(3,2));
        ct.add(jb1);
        ct.add(jb2);
        ct.add(jb3);
        ct.add(jb4);
        ct.add(jb5);
        ct.add(jtf);

        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
        jb5.addActionListener(this);

    //    화면에 보이도록... 사이즈:500,300
        setTitle("JButtonTest2");
        setSize(250,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        jtf.setText(e.getActionCommand());
    }
}

public class JButtonTest2 {
    public static void main(String[] args) {
        new JButton2();

    }
}
