package com.example.shardingspringboot.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 读写分离读
 *
 * @author gcg
 * @create 2020-03-28 17:18
 **/
public class Test4 {

    public static void main(String[] args) throws SQLException {
        String sql = "select * from t_order";
        try (
            Connection conn = ReadWriteDataSourceUtil.getDataSource().getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    System.out.print(rs.getInt(1) + " ");
                    System.out.print(rs.getInt(2) + " ");
                    System.out.print(rs.getInt(3) + " ");
                    System.out.println();
                }
        }
    }

}
