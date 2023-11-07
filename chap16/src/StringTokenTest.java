import java.util.StringTokenizer;

public class StringTokenTest {
    public static void main(String[] args) {
        String s1="name kimjy name F age 23";
        String s2="name,kimjy,gender,F,age,23";
        String s3="name/kimjy/gender/F/age/23";

        System.out.println(":: 빈칸을 기준으로 분리 ::");
        StringTokenizer st1=new StringTokenizer(s1);
        //토큰이 있으면 true, 없으면 false를 반환
        while(st1.hasMoreTokens()){
            String first=st1.nextToken(); //다음 토큰 문자열을 기준으로 문자열 반환 //name name age
            String second=st1.nextToken(); //kimjy F 23
            System.out.println(first+ "\t"+second);

        }
        System.out.println(":: ,을 기준으로 분리 ::");
        StringTokenizer st2=new StringTokenizer(s2,",");
        //토큰이 있으면 true, 없으면 false를 반환
        while(st2.hasMoreTokens()){
            String first=st2.nextToken(); //다음 토큰 문자열을 기준으로 문자열 반환 //name name age
            String second=st2.nextToken(); //kimjy F 23
            System.out.println(first+ "\t"+second);

        }
        System.out.println(":: /을 기준으로 분리 ::");
        StringTokenizer st3=new StringTokenizer(s3,"/");
        //토큰이 있으면 true, 없으면 false를 반환
        while(st3.hasMoreTokens()){
            String first=st3.nextToken(); //다음 토큰 문자열을 기준으로 문자열 반환 //name name age
            String second=st3.nextToken(); //kimjy F 23
            System.out.println(first+ "\t"+second);

        }


    }
}
