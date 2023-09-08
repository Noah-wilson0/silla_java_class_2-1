/*
작성일:2023년 9월8일
작성자:컴퓨터소프트웨어공학부 202095097 최원진
설명: 추상클래스 - 동물의 울음소리를 출력하자.
    클래스 메소드

 */
//추상클래스 - 동물
abstract class myAnimal2{
    abstract String sound2();
    //    abstract String sound(){ //추상 클래스는 구현 기능만 가능 즉, 선언만 가능하다
    static void displayInfo2(){
        System.out.println("동물의 울음소리입니다.");
    }
//    }
}
class myCat2 extends myAnimal2{
    @Override
    String sound2() {
        return "야옹~~";
    }

//    @Override   //오류 이유:static은 정적 메소드 이므로 오버 라이딩 불가능
//    static void displayInfo2() {
//
//    }
static void displayInfo2() {
    System.out.println("고양이 울음소리입니다.");
}
}


public class AnimalTest2 {


    public static void main(String[] args) {

        myAnimal2 mycat2=new myCat2(); // 방법 2
//        mycat2.displayInfo2();
        mycat2.displayInfo2();

        System.out.println(mycat2.sound2());
    }
}
