import java.sql.*;

public class DB_Up_Del {
    public static void main(String[] args) {
        Connection conn;
        String url = "jdbc:mysql://localhost:3306/dbstudent?serverTimezone=UTC";
        // 데이터베이스 URL           localhost 또는 127.0.0.1 로 설정.
        String id = "root";   // DB에 로그인할 ID
//        String pw = "495108";   // MYSQL 설정 시 입력한 PASSWORD
        String pw = "1234";
        //SQL문 실행을 위해 사용하는 클래스 Statement
        Statement stmt = null;

        try {
            //1단계. JDBC 드라이버 로드
            Class.forName("com.mysql.cj.jdbc.Driver");  // JDBC 드라이버 로드.
            //2단계. 데이터 베이스 연결.
            conn = DriverManager.getConnection(url, id, pw);  // 데이터베이스 연결.
            System.out.println("DB 연결 완료");
            //3단계. Statement 생성.
            stmt = conn.createStatement();
            //4단계. SQL문 전송.
            stmt.executeUpdate("update student set NAME='홍길순' where ID='20201111'");
            //5단계. 결과 받기(메소드 호출)
            printTable(stmt);
            //6단계. 연결 해제
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("JDBC 드라이버 로드 에러");
        } catch (SQLException e) {
            System.out.println("DB 연결 오류");
        }
    }

    //출력결과 메소드
    private static void printTable(Statement stmt) throws SQLException {
        //5단계
        ResultSet result = stmt.executeQuery("select * from student");
        while (result.next()) {
            System.out.print(result.getString("NAME"));
            System.out.print("\t|\t" + result.getString("ID"));
            System.out.println("\t|\t" + result.getString("Dept"));


            //getString() 메소드는 해당 데이터 타입으로 '열' 값을 읽어온다.
            //모든 데이터 타입에 대해 읽어오기 가능.
            //필요시 데이터 타입 변환해야 함.
        }

        result.close();
    }
}
