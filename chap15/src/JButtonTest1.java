import javax.swing.*;
import java.awt.*;

//GUI 클래스
class JButton1 extends JFrame{
    public JButton1(){
        //이미지 아이콘 객체 생성.
        ImageIcon korea=new ImageIcon("image/korea1.gif");
        ImageIcon usa=new ImageIcon("image/usa.gif");
        ImageIcon germany=new ImageIcon("image/germany.gif");

        //버튼 객체 생성
        JButton nat=new JButton(korea);
        nat.setPressedIcon(usa); //버튼을 누르면 미국 국기
        nat.setRolloverIcon(germany);//버튼에 마우스를 올리면 독일 국기
        //컨테이너 생성.
        Container ct=getContentPane();
        //FlowLayout 생성
        ct.setLayout(new FlowLayout());
        //컨터이너에 버튼 추가
        ct.add(nat);

        //화면에 보이도록... 사이즈:500,300
        setTitle("JButtonTest1");
        setSize(500,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);


    }

}
public class JButtonTest1 {
    public static void main(String[] args) {
        new JButton1();
    }
}
