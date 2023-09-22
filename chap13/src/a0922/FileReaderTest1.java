/*
    작성일: 2023년 9월 22일
    작성자:  컴퓨터 소프트웨어 공학부 202095097 최원진
    설명: 파일에 저장된 내용 가져오기.(출력)
 */
package a0922;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderTest1 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        //읽어들일 파일면으로 객체 생성.
        try {
            System.out.println("읽을 파일면을 입력하세요:");
            String sfile= scan.next(); //문자열로 입력된 파일면 저장

            FileReader fr= new FileReader(sfile);
            //한 문자씩 읽기
            int i;
            while((i=fr.read())!=-1) { //데이터를 모두 읽으면 -1을 반환해서 루프 종료
                System.out.print((char)i);
            }
            fr.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
        }catch (IOException e){
            System.out.println("읽어 들일 파일이 없습니다.");
        }


    }
}
