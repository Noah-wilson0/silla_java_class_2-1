import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

//GUI 클래스
class JTFJA extends JFrame implements ActionListener{
    //텍스트 필드 객체 선언
    private JTextField input;
    //텍스트 에어리어 객체 선언
    private JTextArea output;
    //라벨객체 선언
    private JLabel jl=new JLabel("텍스트를 입력하세요.");

    //생성자
    public JTFJA(){
        // 20자 입력 가능한 텍스트 필드 객체 생성.
        input=new JTextField(20);
        //10줄 20칸 텍스트 에어리어 객체 생성.
        output=new JTextArea(10,20);
        //텍스트 에어리어 수정 불가 설정
        output.setEditable(false);

        //컨테이너 생성.
        Container ct=getContentPane();
        //FlowLayout 생성
        ct.setLayout(new FlowLayout());
        //패널에 input/output 추가
        JPanel jp=new JPanel();
        jp.add(input);
        jp.add(output);
        //패널과 레이블을 컨테이너에 추가
        ct.add(jp);
        ct.add(jl);
        //컴포넌트에 리스너 등록
        input.addActionListener(this);
        //화면에 보이도록... 사이즈:500,300
        setTitle("JTextField와 JTextArea");
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        input.requestFocus(true); //강제로 포커스 주는 방법
        output.requestFocus(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    if(output.getLineCount()<=output.getRows()){ //텍스트 필드가 텍스트 에어리어 크기보다 작을떄 추가
        output.append(e.getActionCommand()+"\n");//텍스트에어리어에 글 내용 추가
        input.setText(""); //텍스트 필드 내용 삭제(빈칸화 하기)
    }
    else {
        //10줄을 넘으면..
        jl.setText("입력이 종료되었습니다.");
        input.setEditable(false); //더이상 입력 불가
    }
    }
}
//메인 클래스
public class JTFJATest1 {
    public static void main(String[] args) {
        new JTFJA();
    }
}
