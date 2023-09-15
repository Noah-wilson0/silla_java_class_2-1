import java.util.Scanner;

public class Error {
    static void x(){
        y();
    }
    static void y(){
        z();
    }
    static void z(){
        int i=1;
        int j=0;
        System.out.println(i/j);
    }
    public static void main(String[] args) {
        x();
    }

    public static class ExceptionTest01 {
        public static void main(String[] args) {
            Scanner stdIn= new Scanner(System.in);

            System.out.println("첫 번쨰 숫 입력:");
            int num1 = stdIn.nextInt();

            System.out.println("두 번쨰 숫 입력:");
            int num2 = stdIn.nextInt();

            System.out.println(num1 /num2);



        }
    }
}
