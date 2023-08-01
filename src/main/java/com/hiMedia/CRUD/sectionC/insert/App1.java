package com.hiMedia.CRUD.sectionC.insert;

import com.hiMedia.model.dto.EmpDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

import static com.hiMedia.common.JDBCTemplate.close;
import static com.hiMedia.common.JDBCTemplate.getConnection;


public class App1 {

    public static void main(String[] args) {

        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        int result = 0;

        Properties prop = new Properties();

        Scanner sc = new Scanner(System.in);
        EmpDTO eDTO = new EmpDTO();

        System.out.print("추가 할 사원의 이름: ");
        String empName = sc.nextLine();
        eDTO.setEMP_NAME(empName);

        System.out.print("사원 번호: ");
        String empId = sc.nextLine();
        eDTO.setEMP_ID(empId);

        System.out.print("사원 주민등록번호: ");
        String empNo = sc.nextLine();
        eDTO.setEMP_NO(empNo);

        System.out.print("사원 직급코드: ");
        String jobCode = sc.nextLine();
        eDTO.setJOB_CODE(jobCode);

        System.out.print("사원 급여코드: ");
        String salLevel = sc.nextLine();
        eDTO.setSAL_LEVEL(salLevel);

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/hiMedia/mapper/employee-query.xml"));
            String query = prop.getProperty("insertEmp");

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, eDTO.getEMP_NAME());
            pstmt.setString(2,eDTO.getEMP_ID());
            pstmt.setString(3, eDTO.getEMP_NO());
            pstmt.setString(4, eDTO.getJOB_CODE());
            pstmt.setString(5, eDTO.getSAL_LEVEL());


          result = pstmt.executeUpdate();
       System.out.println(result + "명의 사원 추가 완료");

        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(conn);
            close(pstmt);
        }
    }

}
