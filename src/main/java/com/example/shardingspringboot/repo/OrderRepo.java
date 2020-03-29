package com.example.shardingspringboot.repo;

import com.example.shardingspringboot.entity.Order;
import com.example.shardingspringboot.vo.OrderItemVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * order的repo
 *
 * @author gcg
 * @create 2020-03-29 12:29
 **/
@Repository
public interface OrderRepo {

    List<Order> getList(@Param("orderId") Integer orderId, @Param("start") Integer start, @Param("length") Integer length);

    boolean saveList(List<Order> list);

    List<OrderItemVo> getJoinList();
}
