import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class exam_02 extends JFrame{
    //길이 값 변수 선언
    JTextArea jta2;
    //결과값 반환할 변수 선언
    JTextArea jtf;
    public exam_02(){
        //컨테이너 생성.
        Container ct=getContentPane();

        //패널 2개 생성
        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
        JPanel jp3=new JPanel();

        //컨테이너 배치관리자 설정-FlowLayout 생성
        ct.setLayout(new FlowLayout());

        //패널 배치관리자 설정-GridLayout
        jp1.setLayout(new GridLayout(2,1,5,5));
        jp2.setLayout(new FlowLayout());
        jp3.setLayout(new GridLayout(2,1,10,10));

        //jp1의 JLabel과JTextArea 생성
        JLabel jl1=new JLabel("길이를 입력하고, 도형의 버튼을 클릭하세요.");
        jta2=new JTextArea(1,20);



        //jp1에 JTextArea추가
        jp1.add(jl1);
        jp1.add(jta2);
        //jp2의 버튼 생성
        JButton jb1=new JButton("원");
        JButton jb2=new JButton("삼각형");
        JButton jb3=new JButton("사각형");
        JButton jb4=new JButton("리셋");

        jp2.add(jb1);
        jp2.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);

        //버튼을 누를떄마다 이번트 작동
        jb1.addActionListener(new EventProcess());
        jb2.addActionListener(new EventProcess());
        jb3.addActionListener(new EventProcess());
        jb4.addActionListener(new EventProcess());


        //jp3에 쓸 JLabel괴JTextArea 만들기
        JLabel jl2=new JLabel("결과");
        jtf=new JTextArea(1,20);
        //jp3의 결과창 생성
        jp3.add(jl2);
        jp3.add(jtf);

        //컨테이너에 패널 추가
        ct.add(jp1);
        ct.add(jp2);
        ct.add(jp3);


        setTitle("도형의 넓이 구하기 - 최원진");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setVisible(true);



    }



    private class EventProcess implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // JTextArea에서 문자열 가져오기
            try {
                String inputText = jta2.getText();
                int r=Integer.parseInt(inputText);
                //원
                if(e.getActionCommand()=="원"){
                    jtf.setText(r+"x"+r+"x"+"3.14 = "+r*r*3.14);
                }
                //삼각형
                if(e.getActionCommand()=="삼각형"){
                    jtf.setText(r+"x"+r+"/"+2+" = "+(double)r*r/2);
                }
                //사각형
                if(e.getActionCommand()=="사각형"){
                    jtf.setText(r+"x"+r+" = "+r*r);
                }
                //리셋
                if(e.getActionCommand()=="리셋"){
                    jta2.setText("");
                    jtf.setText("");
                }
            }catch (NumberFormatException ex){
                //숫자가 아닌 문자를 입력했을떄
                jta2.setText("");
                jtf.setText("길이(숫자)를 입력하셔야 합니다.");
            }
        }
    }
}


public class Exam02 {
    public static void main(String[] args) {
        new exam_02();
    }
}
