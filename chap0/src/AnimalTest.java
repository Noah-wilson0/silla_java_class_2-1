/*
작성일:2023년 9월8일
작성자:컴퓨터소프트웨어공학부 202095097 최원진
설명: 추상클래스 - 동물의 울음소리를 출력하자.

 */
//추상클래스 - 동물
abstract class myAnimal{
    abstract String sound();
//    abstract String sound(){ //추상 클래스는 구현 기능만 가능 즉, 선언만 가능하다
    void displayInfo(){
        System.out.println("동물의 울음소리입니다.");
    }
//    }
}
class myCat extends myAnimal{
    @Override
    String sound() {
        return "야옹~~";
    }
    @Override
    void displayInfo() {
        System.out.println("고양이 울음소리입니다.");
    }
}


public class AnimalTest {


    public static void main(String[] args) {


//        myCat cat=new myCat(); //방법 1
//        cat.displayInfo();
//        cat.sound(); //return값이므로 출력은 불가능
//        System.out.println(cat.sound());

        myAnimal mycat=new myCat(); // 방법 2
//        mycat.displayInfo();
        mycat.displayInfo();
        System.out.println(mycat.sound());
    }
}
