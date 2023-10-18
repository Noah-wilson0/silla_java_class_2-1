import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//GUI클래스-이벤트 포함
//1. 처리할 이벤트 종류 결정-ActionEvent
//2. 이벤트에 적합한 이벤트 리스너 인터페이스 사용하여 클래스 작성-ActionListener
class JLabel2 extends JFrame {
    private JLabel result = new JLabel();
    public ImageIcon img1, img2;

    public JLabel2() {
        img1 = new ImageIcon("image\\apple.jpg");
        img2 = new ImageIcon("image/pear.jpg");
        //버튼 만들기
        JButton apple = new JButton("사과");
        JButton pear = new JButton("배");

        //컨테이너 생성.
        Container ct = getContentPane();
        //배치관리자 설정-FlowLayout
        ct.setLayout(new FlowLayout());
        //컨체이너에 버튼과 라벨 추가
        ct.add(apple);
        ct.add(pear);
        ct.add(result);
        //3.이벤트를 받아들일 컴포넌트에 리스너 등록
        apple.addActionListener(new inner_action()); //버튼에 리스너 등록, 처리객체로 내부 클래스 지정
        pear.addActionListener(new inner_action()); //버튼에 리스너 등록, 처리객체로 내부 클래스 지정
        //화면에 보여주기
        setTitle("이벤트 테스트3");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    //내부 클래스를 이용한 이벤트 처리
    private class inner_action implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "사과") {
            result.setIcon(img1);
            result.setText("맛있는 사과입니다.");
        }
        if (e.getActionCommand() == "배") {
            result.setIcon(img2);
            result.setText(("좋아하는 배입니다."));
        }
    }
}
}


//메인 클래스
public class JLabelTest2 {
    public static void main(String[] args) {
        new JLabel2();
    }
}
