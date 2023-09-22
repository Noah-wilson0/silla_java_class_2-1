/*
    작성일: 2023년 9월 22일
    작성자:  컴퓨터 소프트웨어 공학부 202095097 최원진
    설명: 바이트 단위로 파일에 저징.(파일 생성)
 */
package a0922;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutoutStreamTest1 {
    public static void main(String[] args) throws IOException {
        Scanner scan=new Scanner(System.in);
        System.out.println("저장 파일명을 입력하세요.");
        String sfile= scan.next();

        //파일으로 객체 생성.
        FileOutputStream fos= new FileOutputStream(sfile);

        int i;
        for(i=1;i<260;i++){
            fos.write(i); //파일에 내용 쓰기.(저장)
        }
        fos.close(); //파일 스트림 닫기

        System.out.println(sfile+" 파일명으로 바이트 파일을 생성하였습니다.");











    }
}
