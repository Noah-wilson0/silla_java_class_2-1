public class q1 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        try {
            System.out.println("2/0은 :");
            int div=b/a;
            System.out.println(div);
        }catch (RuntimeException ex){ //null 참조에 대한 메서드 호출,유효하지않은 인덱스,0으로 나누기,잘못된 인수 전달시 발생하는 예외 클래스들의 상위클래스이다.
            System.out.println("RuntimeException 예외 발생"); //정답
        }
        catch (Exception ex){
            System.out.println("Exception 예외 발생");
        }
//        System.out.println("2/0은 :");
//        int div=b/a;   //ArithmeticException
//        System.out.println(div);

    }
}
