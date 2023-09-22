/*
    작성일: 2023년 9월 22일
    작성자:  컴퓨터 소프트웨어 공학부 202095097 최원진
    설명: 문자를 파일에 쓰기.(저장)
 */
package a0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest1 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);

        System.out.println("저장 파일명을 입력하세요.");
        String sfile= scan.next();
        //파일에 저장할 문자열 생성
        String source="비어 있어야 비로소 가득해지는 사랑\n"+"평온한 마음으로 아침을 맞는다는 것입니다.\n";

        //파일 객체 생성
        FileWriter fw= new FileWriter(sfile);
        //문자열을 파일에 출력,
        fw.write(source); //겍체를 통해 a.txt파일에 source에 있는 내용을 출력(저장)
        fw.close();
        System.out.println(sfile+"파일이 생성되었습니다.");





    }
}
