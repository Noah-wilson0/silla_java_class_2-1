import java.util.Scanner;

public class ExceptionTest02 {
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);

        System.out.println("첫 번쨰 숫 입력:");
        int num1 = stdIn.nextInt();

        System.out.println("두 번쨰 숫 입력:");
        int num2 = stdIn.nextInt();
try {
    System.out.println(num1 / num2);
}catch (Exception e){
    System.out.println("0으로 나눌 수 없습니다.");
    System.out.println("해당 에외:"+e);
//    e.printStackTrace();
}
//try {
//     num1 = stdIn.nextInt();
//}catch (Exception e){
//    System.out.println("문자는 안됩니다.");
//}

    }
}
