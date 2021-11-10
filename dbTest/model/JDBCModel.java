package dbTest.model;

import java.sql.*;
 
import dbTest.model.Employee;
 
public class JDBCModel {
    // 사원 전체 조회용 메소드
    public void testJDBC() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
         
        // 1. 해당 데이터 베이스에 대한 라이브러리 등록 작업
        // Class.forName("클래스명"); // ClassNotFoundException 처리를 해야 함
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
             
            // 2.데이터베이스와 연결함  // SQLException 처리를 해야한다.
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
             
            System.out.println(conn);
             
            // 3. 쿼리문 작성 후 DB에서 쿼리문 실행시키고 결과를 가지고 옴
            String query = "SELECT * FROM EMPLOYEE";
             
            stmt = conn.createStatement();
            //executeQuery 매개변수인 SQL문을 수행하고 RESULTSet객체 반환, SELECT문을 실행할 때 사용
            rset = stmt.executeQuery(query);
             System.out.println("======EMPLOYEE 테이블 출력 완료======");
            while (rset.next()) {
                System.out.println( rset.getInt("ENO") + ", " +
                                    rset.getString("ENAME") + ", " +
                                    rset.getString("JOB") + ", " +
                                    rset.getInt("MANAGER") + ", " +
                                    rset.getDate("HIREDATE") + ", " +
                                    rset.getInt("SALARY") + ", " +
                                    rset.getInt("COMMISSION") + ", " +
                                    rset.getInt("DNO")
                        );
                 
            }
 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                // 4. DB와 관련된 객체는 반드시 close 해야 함
                rset.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         
    }
    public void testJDBC2(int empNo) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;
         
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
             
            conn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe", "hr", "hr");
             
            String query = "SELECT * FROM EMPLOYEE WHERE ENO = " + empNo;
            //SQL문을 전송 할 수 있는 Statement 객체를 생성 
            stmt = conn.createStatement();
             
            rset = stmt.executeQuery(query);
             
            while (rset.next()) {
                System.out.println(rset.getInt("ENO") + ", " +
                        rset.getString("ENAME") + ", " +
                        rset.getString("JOB") + ", " +
                        rset.getInt("MANAGER") + ", " +
                        rset.getDate("HIREDATE") + ", " +
                        rset.getInt("SALARY") + ", " +
                        rset.getInt("COMMISSION") + ", " +
                        rset.getInt("DNO")
                    );
                 
            }
             
 
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                rset.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         
    }
 
    public void testInsert(Employee emp) {
        Connection conn = null;
        Statement stmt = null;
        int result = 0;
         
        String query = "INSERT INTO employee(ENO, ENAME, JOB, MANAGER, HIREDATE, SALARY, COMMISSION, DNO)"
                + "VALUES(" +
                emp.getEmpNo() + ", '" +
                emp.getEmpName() + "', '" +
                emp.getJob() + "', " +
                emp.getMgr() + ", " +
                "SYSDATE, " +
                emp.getSal() + ", " +
                emp.getComm() + ", " +
                emp.getDeptNo() +
                ")";
        System.out.println(query);
         
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
            //Connection의 자동 커밋 유무를 설정
            conn.setAutoCommit(false);
            
            stmt = conn.createStatement();
             
            result = stmt.executeUpdate(query);
             
            if(result > 0) {
                System.out.println(result + "개의 행이 추가되었습니다.");
                //트랜잭션으로 설정된 모든 자원을 커밋
                conn.commit();
                System.out.println("커밋 완료");
            }else {
                System.out.println(result + "개의 행 추가 실패!");
              //트랜잭션으로 설정된 모든 자원을 롤백
                conn.rollback();
                System.out.println("롤백 완료");
            }
             
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
         
    }
 
    public void testUpdate(Employee e) {
        Connection conn = null;
        Statement stmt = null;
        int result = 0;
         
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
             
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
             
            conn.setAutoCommit(false);
            
            stmt = conn.createStatement();
             
            String query = "UPDATE employee SET " +
                    "JOB = '" + e.getJob() +
                    "' WHERE eNo = " +
                    e.getEmpNo();
            System.out.println(query);
             
            result = stmt.executeUpdate(query);
             
            System.out.println(result + "개의 행이 수정되었습니다.");
             
             
             
            query = "UPDATE employee SET " +
                    "SALARY = " + e.getSal() +
                    " WHERE eNo = " +
                    e.getEmpNo();
            System.out.println(query);
             
            result = stmt.executeUpdate(query);
             
            System.out.println(result + "개의 행이 수정되었습니다.");
             
             
             
            query = "UPDATE employee SET " +
                    "commission = " + e.getComm() +
                    " WHERE eNo = " +
                    e.getEmpNo();
            System.out.println(query);
            //.executeUpdate = INSERT,UPDATE,CREATE,DROP SQL 문을 수행
            result = stmt.executeUpdate(query);
             
            System.out.println(result + "개의 행이 수정되었습니다.");
             
            conn.commit();
             
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }
 
    public void testDelete(int empNo) {
        Connection conn = null;
        Statement stmt = null;
        int result = 0;
         
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
             
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
             
            conn.setAutoCommit(false);
            
            stmt = conn.createStatement();
             
            String query = "DELETE FROM employee WHERE eNo = " + empNo;
            System.out.println(query);
             
            result = stmt.executeUpdate(query);
             
            if (result > 0) {
                System.out.println(result + "개의 행이 수정되었습니다.");
            }else {
                System.out.println("실패했습니다.");
            }
             
            conn.commit();
             
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        } catch (SQLException e1) {
            e1.printStackTrace();
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }
 
}

