import javax.swing.*;
import javax.swing.event.AncestorListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;

class Lotto extends JFrame implements ActionListener {
    JLabel jl;
    public Lotto(){
        Container ct=getContentPane();
        jl=new JLabel();
        JButton jb=new JButton("로또 번호 자동 생성");

        //컨테이너에 버튼과 라벨 추가
        ct.add(jb);
        ct.add(jl);

        //버튼에 리스너 추가
        jb.addActionListener(this);
        setLayout(new FlowLayout());
        setSize(300,250);
        setTitle("lotto number Generate");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
//버튼을 누르면 발생하는 이벤트
    @Override
    public void actionPerformed(ActionEvent e) {
        //Random() 클래스 객체로 생성.
        Random r=new Random();
        //숫자를 담을 배열 생성
        int[] rnum=new int[6];
        //같은 번호가 있는지 확인을 위해 변수 생성.
        int temp;
        int i=0;
        a: while(i<6){
            //랜덤 번호 생성.
            temp=r.nextInt(1,45);
            //배열에 저장된 값과 temp에 저장된 값을 비교하여 같으면 다시 랜덤수 발생
            for(int j=0;j<=i;j++) {
                if(temp==rnum[j]){
                    continue a;
                }
            }
            rnum[i] = temp;
            i++;
        }
        //Arrays.toString은 배열을 문자열로 표현으로 변환하는데 사용하는 메서드
        jl.setText("이번 주 로또 당첨 번호 :"+ Arrays.toString(rnum));
    }
}

public class LottoNumGUI {
    public static void main(String[] args) {
        new Lotto();
    }
}
