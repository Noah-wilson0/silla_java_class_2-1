import javax.swing.*;
import java.awt.*;

class FirstFrame2 extends JFrame{
    public FirstFrame2(){
        //프레임으로루터 컨테이너(쟁반) 생성.
        Container ct=getContentPane();
        //버튼 컴포넌트 생성
        JButton jb= new JButton("테스트 버튼2");

        //컨테이너 버튼 추가
        ct.add(jb);

        //프레임 제목 생성
        setTitle("두 번째 GUI프로그램 - JFrame 상속");
        //프레임 크기
        setSize(400,300);
        // 프레임을 화면에 출력
        setVisible(true);
        //창을 닫으면 프로그램 종료된다.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

public class FrameTest2 {
    public static void main(String[] args) {
        new FirstFrame2();
    }
}
