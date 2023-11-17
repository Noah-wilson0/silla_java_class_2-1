# silla_java_class_2-1

## 신라대학교 2학년 2학기 java 실습 수업
1.[Byte stream](#13장-0922패키지-FileInputStreamTest1-class-수정사항)<br>
2.[getChars](#13장-0926패키지-FileIOTest1-getchars)<br>
3.[Java Swing](#14장-1006-java-awt-swing)<br>
4.[Java Swing-이벤트 처리](#15장-1031-JTabbedPane) <br> 
5.[중간고사 못푼 문제 해결](#중간고사-못푼-문제-해결) <br>
### 기말고사
6.[16장 LocalDate](#16장-localdate) <br>
7.[17장 linkedList](#linkedlist-데이터-삽입-시간) <br>

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

```
  private class EventProcess implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            //원
            if(e.getActionCommand()=="원"){
//                jtf.setText(+"*"+"*"+"3.14 = "+**3.14);
            }

            //삼각형
            if(e.getActionCommand()=="삼각형"){
//                jtf.setText(+"*"+"/"+"2 = "+**3.14);
            }
            //사각형
                if(e.getActionCommand()=="사각형"){
//                    jtf.setText(+"*"+"*"+" = "+**3.14);
                }
            //리셋
            if(e.getActionCommand()=="리셋"){

            }
        }        
```
위 코드를 해결하지 못했었는데 아래와 같이 수정을 했다.

```
String inputText = jta2.getText();
                int r=Integer.parseInt(inputText);
```
- 제일 먼저 사용자에게 입력받은 jta의 값을 inputText라는 문자열에 저장 하고 int형으로 변환시킨다.
  ```
                if(e.getActionCommand()=="원"){
                    jtf.setText(r+"x"+r+"x"+"3.14 = "+r*r*3.14);
                  //리셋
                if(e.getActionCommand()=="리셋"){
                    jta2.setText("");
                    jtf.setText("");
                }
  catch (NumberFormatException ex){
                //숫자가 아닌 문자를 입력했을떄
                jta2.setText("");
                jtf.setText("길이(숫자)를 입력하셔야 합니다.");
            }
  ```
  - 그 다음 위 코드와 같이 사용자가 "원"을 클릭하면 결과 창(jtf)에 값을 뿌려주면 된다.
  - 리셋은 jta2.setText="";로 하면 입력 값이 사라진다.
  - 마지막으로 try{...}catch(){...}문을 통해 숫자가 아닌 다른 값을 입력했을떄 예외 처리로 넘기면 된다.
       
 클릭===> [해결 코드](https://github.com/noah-wilson0/silla_java_class_2-1/blob/main/%EC%A4%91%EA%B0%84%EA%B3%A0%EC%82%AC/%ED%95%B4%EA%B2%B0%ED%95%9C%20%EB%AC%B8%EC%A0%9C(2%EB%B2%88).java)


### [16장 localdate](https://github.com/noah-wilson0/silla_java_class_2-1/blob/main/chap16/src/TimeTest2.java)
- 교재 코드는 my_birth,current,hundred 변수를 toString 을 사용하여 JTextArea에 추가하였다.
``` java
LocalDate my_birth= LocalDate.of(year, month, day);
        LocalDate current=LocalDate.now();
        LocalDate hundred=my_birth.plusYears(100);
jta1.append("당신의 생일: "+toString(my_birth));
jta1.append(("오늘 날짜는:"+toString(current)));
jta1.append(("생일부터 오늘까지의 일: "+my_birth.until(my_birth,current)));
```
- 하지만  toString()을 사용하여 JTextArea에 추가하면 오류나 난다.
-  LocalDate는 해당 객체의 문자열을 반환하기 때문에 toString()을 쓰게되면 java.awt.Component 클래스에 있어서 충돌이 발생하여 오류가 나게된다.
```java
//수정 결과
jta1.append("당신의 생일: " + myBirth);
jta1.append("오늘 날짜는: " + current);
jta1.append("생일부터 오늘까지의 일: " + myBirth.until(current));
```
 String 클래스는 이미 Object 클래스를 상속하고 있으며, Object 클래스에는 toString 메서드가 정의되어 있다. 따라서 String 클래스에서 직접 toString 메서드를 호출할 필요가 없다.<br>
하지만 아래와 같이System.out.println(toString(t));에서 toString 메서드 호출은 불 필요하게 되고, 오류가 나게 된다. <br>

```java
public class test {
    public static void main(String[] args) {
        String t="hi";
        System.out.println(toString(t));
    }
}
```

### [linkedlist 데이터 삽입 시간](https://github.com/noah-wilson0/silla_java_class_2-1/blob/main/chap17/src/LinkedListTest1.java)
*삽입 시간은 항상 상이하지만 상대적 결과는 비슷함 <br>
ArrayList - 순차적 삽입 시간:18 <br>
LinkedList - 순차적 삽입 시간:1348 <br>
ArrayList - 순차적 삽입 시간:1348 <br>
ArrayList - 중간 삽입 시간:1227 <br>
LinkedList - 중간 삽입 시간:15 <br>
<br>
- 처음에 데이터를 순차적으로 삽입할때는 LinkedList의 데이터 삽입 시간이 더 많이 걸린다. 이유: 링크도 걸어줘야되기 때문이다.
- 하지만 중간에 데이터를 삽입 할때는 LinkedList의 삽입 시간이 더 적다. 이유:ArrayList는 중간 삽입이 되는 경우, 뒤의 요소들 자리를 한칸 씩 이동해야된다.



































