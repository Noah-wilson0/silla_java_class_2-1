/*
    작성일: 2023년 9월 22일
    작성자:  컴퓨터 소프트웨어 공학부 202095097 최원진
    설명: 바이트 단위로 파일에 저장된 내용 가져오기.(출력)
 */
package a0922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileInputStreamTest1 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("읽을 파일명을 입력하세요.");
        String sfile= scan.next();

        //읽어들일 파일 객체 생성.
        FileInputStream fis=new FileInputStream(sfile);

        //한 바이트씩 읽기
        int i;
        while((i=fis.read())!=-1) { //데이터를 모두 읽으면 -1을 반환해서 루프 종료
            System.out.print((char)i);
        }
        fis.close(); //입력 스트림 닫기
        System.out.println(sfile+"파일로 부터 바이트 단위로 읽어 화면에 출력하였습니다.");




    }
}
