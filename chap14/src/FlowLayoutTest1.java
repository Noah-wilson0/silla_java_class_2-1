import javax.swing.*;
import java.awt.*;

class FlowLayout1 extends JFrame{
    //생성자
    public FlowLayout1(){
        //프레임으로부터 컨테이너 생성
        Container ct= getContentPane();

        //컨테이너에 컴포넌트를 수직방향으로 연속으로 배치시키는 관리자
        FlowLayout f1=new FlowLayout(FlowLayout.RIGHT,10,15);
                                                //정렬, 수평,간격,수직 간격
        //컨테이너에 레이아웃 설정
        ct.setLayout(f1);

        //15개의 버튼 컴포넌트를 생성하여 컨테이너에 추가
        for(int i=1;i<16;i++){
            ct.add(new JButton("버튼"+i));
        }
        setTitle("FlowLayout Test");
        setSize(400,300);
        setVisible(true);

        //창을 닫으면 프로그램 종료된다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


public class FlowLayoutTest1 {
    public static void main(String[] args) {
        new FlowLayout1();
    }
}
