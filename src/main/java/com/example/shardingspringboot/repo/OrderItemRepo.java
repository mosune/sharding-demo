package com.example.shardingspringboot.repo;

import com.example.shardingspringboot.entity.OrderItem;

import java.util.List;

/**
 * 详情
 *
 * @author gcg
 * @create 2020-03-29 16:14
 **/
public interface OrderItemRepo {

    void saveList(List<OrderItem> list);
}
