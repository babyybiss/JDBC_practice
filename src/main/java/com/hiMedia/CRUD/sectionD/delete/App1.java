package com.hiMedia.CRUD.sectionD.delete;

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

        System.out.print("제거하고자하는 사원의 번호");
        String EmpId = sc.nextLine();
        eDTO.setEMP_ID(EmpId);

        Properties prop = new Properties();

        try {
            prop.loadFromXML(new FileInputStream("src/main/java/com/hiMedia/mapper/employee-query.xml"));

            String query = prop.getProperty("deleteEmp");
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, eDTO.getEMP_ID());

            result = pstmt.executeUpdate();
            System.out.println(result + "명의 사원 제거 완료!");


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
