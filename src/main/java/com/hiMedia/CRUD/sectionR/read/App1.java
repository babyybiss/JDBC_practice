package com.hiMedia.CRUD.sectionR.read;

import com.hiMedia.model.dto.EmpDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Scanner;

import static com.hiMedia.common.JDBCTemplate.getConnection;

public class App1 {

    public static void main(String[] args) {
        Connection conn = getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/hiMedia/mapper/employee-query.xml"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("조회 하고자하는 사원의 이름: ");
        String empName = sc.nextLine();

        String query = prop.getProperty("selectEmp");
        try {
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, empName);
            rs = pstmt.executeQuery();
            ArrayList<EmpDTO> empList = new ArrayList<>();
            while (rs.next()) {
                EmpDTO empD = new EmpDTO();
                empD.setEMP_ID(rs.getString("EMP_ID"));
                empD.setPHONE(rs.getString("PHONE"));
                empD.setEMAIL(rs.getString("EMAIL"));
                empD.setJOB_CODE(rs.getString("JOB_CODE"));
                empList.add(empD);
            }

            
            for (EmpDTO emp : empList) {
                String id = emp.getEMP_ID();
                String jobcode = emp.getJOB_CODE();
                String email = emp.getEMAIL();
                String phone = emp.getPHONE();

               
                System.out.println(empName + "사원의 직급코드: " + jobcode + ", 사원번호: " + id + ", 이메일: " + email + ", 전회번호: " + phone);
            }

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