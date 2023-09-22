package a0922;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest2_1 {
    public static void main(String[] args) {

//    FileReader 객체 생성.
        try {
            File file=new File("c.txt");
            FileReader fr=new FileReader(file);
            //한 바이틌씩 읽기
            int i;
            while((i=fr.read())!=-1) { //데이터를 모두 읽으면 -1을 반환해서 루프 종료
                System.out.print((char)i);
            }
            fr.close();
            System.out.println("파일로부터 바이트를 읽어 화면에 출력");
        }catch (FileNotFoundException e){

        } catch (IOException e) {

        }


    }

}
