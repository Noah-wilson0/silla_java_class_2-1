package final1027;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JRadioButton1 extends JFrame implements ActionListener {
    JLabel jl;
    JCheckBox[] jc=new JCheckBox[5];
    String[] hobby={"걷기","등산","골프","스킨스쿠버","패러글라이딩"};
    JRadioButton[] jr=new JRadioButton[5];
    String[] age={"20대","30대","40대","50대","60대"};
    public JRadioButton1(){
        jl=new JLabel();
        Container ct=getContentPane();
        JLabel jl1=new JLabel("당신의 취미는?");
        JLabel jl2=new JLabel("당신의 나이는?");

        JPanel hobbypanel=new JPanel();
        JPanel agepanel=new JPanel();
        //나이를 나타내는 체크박스 버튼을 그룹으로 설정
        ButtonGroup gb=new ButtonGroup();

        for(int i=0; i<5;i++){
            //취미를 나타내는 체크 버튼 객체를 배열로 생성
            jc[i]=new JCheckBox(hobby[i]);
            //나이를 나타내는 라이도 버튼 객체를 배열로 생성
            jr[i]=new JRadioButton(age[i]);

            hobbypanel.add(jc[i]); //취미 판넬에 객체 추가
            agepanel.add(jr[i]); //나이 판넬에 객체 추가

            jr[i].addActionListener(this);
            gb.add(jc[i]);
        }
        ct.setLayout(new GridLayout(3,1));
        JPanel jp1=new JPanel();
        jp1.add(jl1);
        jp1.add(hobbypanel);
        JPanel jp2=new JPanel();
        jp2.add(jl2);
        jp2.add(agepanel);
        JPanel jp3=new JPanel();
        jp3.add(jl);

        ct.add(jp1);
        ct.add(jp2);
        ct.add(jp3);
        setTitle("JRadioButton Test");
        setSize(350,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String s="당신의 나이:";

        for(int i=0;i<5;i++){
            if(jc[i].isSelected()==true){
                s=s+hobby[i]+" ";
            }
        }
            s=s+"당신의 취미: ";
            jl.setText(s+e.getActionCommand());

    }
}

public class JRadioButtonTest1 {
    public static void main(String[] args) {
        new JRadioButton1();
    }
}
