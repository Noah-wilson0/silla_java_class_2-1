package final_1031;

import javax.swing.*;
import javax.swing.Icon;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;

class  JComBox extends JFrame implements ItemListener {
    JLabel FruitLabel; //이미지 표시될 영역
    public JComBox(){
        //콤보 박스 객체 생성
        JComboBox<String> fruitCombo=new JComboBox<String>();
        //이미지 표시될 영역 객체 생성
        FruitLabel=new JLabel();

        //과일 배열 생성
        String fruitList[]={"persimmom","banana","pear","apple","cherry","grape"};
        //컨테이너 만들기, 레이아웃 지정
        Container ct=getContentPane();
        ct.setLayout(new FlowLayout());

        //콤보박스에 과일 리스트 추가
        for(int i=0; i<6;i++){
            fruitCombo.addItem(fruitList[i]);
        }
        // 컨테이너에 콤보박스 추가
        ct.add(fruitCombo);
        ct.add(FruitLabel);
        fruitCombo.addItemListener(this);
        //콤보박스에 이벤트 리스너 등록
        //출력
        setTitle("JComboBox Test1");
        setSize(200,200);
        setVisible(true);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        String fruit=(String) e.getItem();
        //패키지 안에서 사용했지만 패키지는 디폴트 취급이라 아래와 같이 사용해도 된다.
        FruitLabel.setIcon(new ImageIcon("image/"+fruit+".jpg"));
    }
}
public class JComBoxTest {
    public static void main(String[] args) {
        new JComBox();
    }
}
