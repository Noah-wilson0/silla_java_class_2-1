import javax.swing.*;
import java.awt.*;

class FirstFrame1{
    //생성자
    public FirstFrame1(){
        JFrame jf=new JFrame("첫번쨰 GUI프로그램");


        //프레임으로루터 컨테이너(쟁반) 생성.
        Container ct=jf.getContentPane();
        //버튼 컴포넌트 생성
        JButton jb= new JButton("테스트 버튼");
        //컨테이너 버튼 추가
        ct.add(jb);

        //프레임 크기
        jf.setSize(400,300);

        // 프레임을 화면에 출력
         jf.setVisible(true);
        //창을 닫으면 프로그램 종료된다.
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}



public class FrameTest1 {
    public static void main(String[] args) {

    new FirstFrame1();

    }
}
