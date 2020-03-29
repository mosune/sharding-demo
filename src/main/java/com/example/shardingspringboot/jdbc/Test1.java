package com.example.shardingspringboot.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 查询测试
 *
 * @author gcg
 * @create 2020-03-28 16:42
 **/
public class Test1 {

    public static void main(String[] args) throws SQLException {
        String sql = "SELECT * FROM t_order where user_id = ?";
        try (
            Connection conn = DataSourceUtil.getDataSource().getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, 1);
                try (ResultSet rs = preparedStatement.executeQuery()) {
                    while(rs.next()) {
                        System.out.print(rs.getInt(1) + " ");
                        System.out.print(rs.getInt(2) + " ");
                        System.out.print(rs.getInt(3) + " ");
                        System.out.println();
                    }
                }
        }
    }

}
