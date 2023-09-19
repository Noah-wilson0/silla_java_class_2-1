/*
    나이를 입력받아 출력하시오.
    입력받은 나이가 정수가 아닌 경우 예외 처리 하시오.

 */

import java.util.Scanner;
import java.util.InputMismatchException;
public class ExceptionTest07 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
try {
    System.out.println("나이를 입력하시오. :");
    int age = scan.nextInt();
    System.out.println("나이가"+age+"살 입니다.");
}catch (InputMismatchException e){
    System.out.println("나이는 정수를 입력하세요."); //실수, 문자, 특수문자 int범위를 벗어난 정수 들은 예외 처리 가능
}
finally {
    scan.close();
}

    }
}
