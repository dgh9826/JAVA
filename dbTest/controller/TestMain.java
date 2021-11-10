package dbTest.controller;


import dbTest.model.Employee;
import dbTest.model.JDBCModel;

public class TestMain {
 
    public static void main(String[] args) {
        JDBCModel model = new JDBCModel();
         
        //전체 조회
        model.testJDBC();
        
        //사번 전달하여 조회
        //model.testJDBC2(7839);
         
         
         
        // 객체 생성 후 삽입
//         Employee emp = new Employee(7777, "JARON", "ANALYST", 9999, 12000, 90, 10);
//         model.testInsert(emp);
         
         
         
        // 객체 생성 후 업데이트
//         Employee e = new Employee(7777, "CHAIRMAN", 50000, 90000);
//         model.testUpdate(e);
////         업데이트 후 전체 조회
//         model.testJDBC();
         
         
         
        // 사번 전달 후 삭제
//         model.testDelete(7777);
//        // 삭제 후 전체 조회
//         model.testJDBC();
    }

}

