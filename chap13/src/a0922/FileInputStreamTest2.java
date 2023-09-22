/*
    작성일: 2023년 9월 22일
    작성자:  컴퓨터 소프트웨어 공학부 202095097 최원진
    설명: 바이트 단위로 파일에 저장된 내용 가져오기.(출력)
 */
package a0922;

import java.io.*;
import java.util.Scanner;

public class FileInputStreamTest2 {
    public static void main(String[] args) throws IOException {
//        파일 객체 생성
        File file=new File("c.txt");

//        FileReader 객체 생성
        FileReader fr=new FileReader(file);

        //한 문자씩 읽기
        int i;
        while((i=fr.read())!=-1) { //데이터를 모두 읽으면 -1을 반환해서 루프 종료
            System.out.print((char)i);
        }

        fr.close();


    }
}
