package com.hiMedia.CRUD.sectionU.update;

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

        Scanner sc = new Scanner(System.in);
        EmpDTO eDTO = new EmpDTO();

        System.out.print("수정하고자하는 사원 번호: ");
        String EmpId = sc.nextLine();
        eDTO.setEMP_ID(EmpId);

        System.out.print("연봉 수정 얼마?");
        int empSal = sc.nextInt();
        eDTO.setSALARY(empSal);
        sc.nextLine();

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/hiMedia/mapper/employee-query.xml"));

            String query = prop.getProperty("updateEmp");
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, eDTO.getSALARY());
            pstmt.setString(2, eDTO.getEMP_ID());


            result = pstmt.executeUpdate();

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
