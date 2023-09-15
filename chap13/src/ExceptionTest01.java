import java.util.Scanner;

public class ExceptionTest01 {
    public static void main(String[] args) {
        Scanner stdIn= new Scanner(System.in);

        System.out.println("첫 번쨰 숫 입력:");
        int num1 = stdIn.nextInt();

        System.out.println("두 번쨰 숫 입력:");
        int num2 = stdIn.nextInt();

        System.out.println(num1 /num2);



    }
}
