package ch12;

public class q2 {
    public static void main(String[] args) {
        Integer i =Integer.valueOf(1) + Integer.valueOf(2); //()안의 문자열을 Integer객체로 반환
        System.out.println("Integer.valueOf(1):"+Integer.valueOf(1));
        System.out.println("Integer.valueOf(2):"+Integer.valueOf(2));

        switch (i){
            case 3:
                System.out.println("three");
                break;

            default:
                System.out.println("other");
                break;
        }
    }

}
