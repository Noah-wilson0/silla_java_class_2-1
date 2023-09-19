public class q2 {
    public static void main(String[] args) {



        try{
                method1();
            System.out.println("메소드 호출 후");
        }catch (ArrayStoreException ex){  //배열에 잘못된 타입의 요소를 할당하면 처리
            System.out.println("ArrayStoreException 예외 발생");
        }catch (ArithmeticException ex){ //산술 오류는 전부 ArithmeticException가 처리함
            System.out.println("ArithmeticException 예외 발생");
        }

    }

    static void method1() throws RuntimeException{
        int a=0;
        int b=2/a;
        System.out.println("나눗셈 후");
    }
}
