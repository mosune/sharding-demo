package com.example.shardingspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * order表
 *
 * @author gcg
 * @create 2020-03-29 12:31
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    private Long id;

    private Integer orderId;

    private Integer userId;

    private String status;

}
