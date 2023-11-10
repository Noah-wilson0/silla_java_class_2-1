import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.StringTokenizer;

class myTime extends JFrame implements ActionListener {
    JLabel jl;
    JTextField jtf;
    JTextArea jta1;
    JTextArea jta2;


    public myTime(){
        //컨테이너 생성
        Container ct=getContentPane();
        //패널 3개 생성
        JPanel jp1=new JPanel();
        JPanel jp2=new JPanel();
        JPanel jp3=new JPanel();
        jl=new JLabel("당신의 생일을 공백으로 구분하여 입력(예:2020 01 01");
        jtf=new JTextField(10);
         jp1.add(jl);
        jp1.add((jtf));

        JButton jb1=new JButton("현재");
        jta1=new JTextArea(4,20);
        jta1.setEditable(false);
        jp2.add(jb1);
        jp2.add((jta1));
        JButton jb2=new JButton("100세");
        jta2=new JTextArea(3,20);
        jta2.setEditable(false);
        jp3.add(jb2);
        jp3.add(jta2);
        //컨테이너에 패널 추가
        ct.add(jp1);
        ct.add(jp2);
        ct.add(jp3);
        //이벤트 추가
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        //화면구성
        setLayout(new FlowLayout());
        setSize(500,300);
        setTitle("Timetest2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //예 2020 11 10
        String birth=jtf.getText();
        StringTokenizer st1=new StringTokenizer(birth);
        int year=Integer.parseInt(st1.nextToken());  //2020
        int month=Integer.parseInt(st1.nextToken()); //11
        int day=Integer.parseInt(st1.nextToken());  //10
        LocalDate my_birth= LocalDate.of(year, month, day);
        LocalDate current=LocalDate.now();
        LocalDate hundred=my_birth.plusYears(100);


        if(e.getActionCommand().equals("현재")){
            jta1.append("당신의 생일: "+my_birth+"\n");
            jta1.append("오늘 날짜는:"+current+"\n");
            jta1.append("생일부터 오늘까지의 일: "+my_birth.until(current,ChronoUnit.DAYS)+"\n");
            jta1.append(("생일부터 오늘까지의 년: "+my_birth.until(current, ChronoUnit.YEARS)));
        } else if (e.getActionCommand().equals("100세")) {
            jta2.append("당신이 100일이 되는 날은: "+hundred+"\n");
            jta2.append("100살까지 남은(week)주"+current.until(hundred,ChronoUnit.WEEKS)+"\n");
            jta2.append("100살까지 남은 일 수:"+current.until(hundred,ChronoUnit.DAYS));

        }
    }
}

public class TimeTest2 {
    public static void main(String[] args) {
new myTime();
    }
}
