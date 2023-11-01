# silla_java_class_2-1

## 신라대학교 2학년 2학기 java 실습 수업
1.[Byte stream](#13장-0922패키지-FileInputStreamTest1-class-수정사항)<br>
2.[getChars](#13장-0926패키지-FileIOTest1-getchars)<br>
3.[Java Swing](#14장-1006-java-awt-swing)<br>
4.[Java Swing-이벤트 처리](#15장-1031-JTabbedPane) <br>

### [13장 0922패키지 FileInputStreamTest1 class 수정사항](https://github.com/noah-wilson0/silla_java_class_2-1/blob/main/chap13/src/a0922/FileInputStreamTest1.java)
- 24번째줄 `fos.write((char)i);` 을 `fos.write(i);`로 수정하면 
 b.txt (바이트단위 파일)이 정상 출력된다.
### [13장 0926패키지 FileIOTest1 getchars](https://github.com/noah-wilson0/silla_java_class_2-1/blob/main/chap13/src/a0926/FileIOTest1.java)
- getchars()는 String의 일부분을 배열로 복사해주는 메소드이다.
source.getChars(0,source.length(),intxt,0);  //source 배열의 source길이만큼 intxt배열에 문자열을 복사한다. 

### [14장 1006 java awt, swing](https://github.com/noah-wilson0/silla_java_class_2-1/tree/main/chap14/src)
- 생성한 JFrame을 화면에 출력 시키려면  `setVisible(true);`을 해야 된다. 만약 이 문법을 사용하거나 "flase"로 할 경우 화면에 출력되지 않는다.
- x창을 닫으면 프로그램 종료된다.
  `setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`
- FlowLayout은 LEFT, CENTER, RIGHT 방향으로 컴포넌트를 수평 방향으로 연속  배치시키는 관리자이다.
- BorderLayout은 컴포넌트를 프레임에 추가할때 방향을 지정하여 EAST, WEST, SOUTH, NORTH방향으로 지정하여 추가해준다.
- GridLayout은 컴포넌트를 행과 열을 가진 배열형태로 배치해준다.
- Jpanel은 Container 클래스의 하위 클래스로 그릇 역할을 한다.

### [15장 1031 JTabbedPane](https://github.com/noah-wilson0/silla_java_class_2-1/tree/main/chap15/src/final_1031)
- 패키지에서 imageIcon을 쓸떄 "final_1031/image/"+fruit+".jpg"를 사용하는 것이 아니고` "image/"+fruit+".jpg" `로 사용해야 된다.


### [중간고사 못푼 문제 해결](https://github.com/noah-wilson0/silla_java_class_2-1/blob/main/%EC%A4%91%EA%B0%84%EA%B3%A0%EC%82%AC/%EB%AA%BB%ED%91%BC%20%EB%AC%B8%EC%A0%9C(2%EB%B2%88).java)
















































