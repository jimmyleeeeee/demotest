package com.demo;

import java.sql.*;

public class RunSqlScript {
    public static void run(String sql) {
        try {

            String url = "jdbc:locahhost";
            String username = "root";
            String password = "root";
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.prepareStatement(sql);
            ((PreparedStatement) stmt).execute();
            System.out.println("====== SUCCESS ======");
        } catch (SQLException e) {
            e.printStackTrace();
        }     }
}
