package ch12;



class TestTest{

    private String text;
    public TestTest(String s){
        this.text=s;
    }
//    text출력방법
    //1번 object클래스 의 toString 메서드 사용
//    toString 메서드: 메서드에 객체가 전달될 때, Java는 그 객체의 toString() 메서드를 자동으로 호출하여 출력하려는 문자열을 얻는다
    @Override
    public String toString(){
        return text;
    }
    //2번 출력만을 위한 클래스를 따로 만든다.
    public String printStrig(){
        return text;
    }


}

public class q3 {
    public static void main(String[] args) {
        TestTest test=new TestTest("ABC");
//        System.out.println(test.test.toLowerCase()); //text는 private라서 접근 불가능
        System.out.println(test); //ABC
        System.out.println(test.printStrig()); //ABC
    }
}
