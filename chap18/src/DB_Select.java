import java.sql.*;
import java.util.Stack;

public class DB_Select {
    public static void main(String[] args) {
        Connection conn;
        String url = "jdbc:mysql://localhost:3306/dbstudent?serverTimezone=UTC";
        // 데이터베이스 URL           localhost 또는 127.0.0.1 로 설정.
        String id = "root";   // DB에 로그인할 ID
//        String pw = "495108";   // MYSQL 설정 시 입력한 PASSWORD
        String pw = "1234";
        //SQL문 실행을 위해 사용하는 클래스 Statement
        Statement stmt=null;
        //SQL문 결과를 받아오기 위한 클래스 ResultSet
        ResultSet result=null;

        try {
            //1단계. JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버 로드.
            //2단계. 데이터 베이스 연결.
            conn = DriverManager.getConnection(url, id, pw);  // 데이터베이스 연결.
            System.out.println("DB 연결 완료");
            //3단계. Statement 생성.
            stmt= conn.createStatement();
            //4단계. SQL문 전송.
//            result=stmt.executeQuery("select * from student");
            result=stmt.executeQuery("select * from student where name='손흥민'");
            //5단계. 결과 받기(메소드 만들기)
            printData(result,"NAME","DEpt","ID");
            //6단계. 연결 해제
            result.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 에러");
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }

    private static void printData(ResultSet srs, String col1, String col2, String col3) throws SQLException{
       while (srs.next()){
           if (!col1.equals("")) {
               System.out.print(srs.getString("NAME"));
           }
           if (!col2.equals("")) {
               System.out.print("\t|\t"+srs.getString("ID"));
           }
           if (!col3.equals("")) {
               System.out.println("\t|\t"+srs.getString("Dept"));
           }
           else {
               System.out.println();
           }
       }
    }
}
