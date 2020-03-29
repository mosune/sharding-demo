package com.example.shardingspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 详情
 *
 * @author gcg
 * @create 2020-03-29 16:10
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderItem {

    private Long id;

    private Long orderId;

    private Integer userId;

    private String status;

}
