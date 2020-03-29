package com.example.shardingspringboot.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author gcg
 * @create 2020-03-28 17:12
 **/
public class Test3 {

    public static void main(String[] args) throws SQLException {
        String sql = "insert into t_order(user_id, order_id) values (?, ?)";
        try (
            Connection conn = ReadWriteDataSourceUtil.getDataSource().getConnection();
            PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
                preparedStatement.setInt(1, 2);
                preparedStatement.setInt(2, 100);
                boolean rs = preparedStatement.execute();
                System.out.println(rs);
        }
    }

}
