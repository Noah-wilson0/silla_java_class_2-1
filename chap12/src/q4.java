package ch12;

public class q4 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("java");
        StringBuffer sb2 = new StringBuffer("easy");

        System.out.println(sb1.append("korea")); //javakorea
        System.out.println(sb2.append(sb1)); //easyjavakorea
        System.out.println(sb1); //javakorea
        System.out.println(sb2); //easyjavakorea
        System.out.println(sb2.substring(5,9));//avak 5~8번 인덱스만 출력
        System.out.println(sb2.delete(5,9)); //easyjorea 6~8번 인덱스 삭제
        System.out.println(sb2);//easyjorea
        System.out.println(sb1.reverse()); //aerokavaj

    }
}
