package a0926;

import java.io.*;
import java.util.Scanner;

class PersonInfo implements Serializable {
    String name;
    String city;
    int age;

    //생성자
    public PersonInfo(String name, String city, int age) {
        this.name = name;
        this.city = city;
        this.age = age;
    }


}
public class ObjectWrite01 {
    public static void main(String[] args) throws IOException {
        Scanner stdin=new Scanner(System.in);
        System.out.println("출력 파일명을 입력하세요 : ");
        String fileName=stdin.next();
        String s1="***고객정보***";

        //직렬화 된 객체를 2개 생성
        PersonInfo p1=new PersonInfo("최원진","부산",25);
        PersonInfo p2=new PersonInfo("홍길동","서울",20);

        //직렬화 된 객체를 2진수로 기록할 파일을 지정.
        //객체를 기록할 수 있는 ObjectOutputStream 객체 생성.
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName));

        //직렬화된 객체를 파일에 2진수로 기록한다.
        oos.writeObject(s1); //제목 1
        oos.writeObject(p1); //최원진 정보2
        oos.writeObject(p2); //홍길동 정보 3

        oos.close();

        System.out.println("파일명으로 객체 파일을 생성하였습니다.");
    }
}
