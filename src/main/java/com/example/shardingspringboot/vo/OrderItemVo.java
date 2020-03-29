package com.example.shardingspringboot.vo;

import lombok.Data;

/**
 * @author gcg
 * @create 2020-03-29 16:17
 **/
@Data
public class OrderItemVo {

    private Long id;

    private Long itemId;

    private String orderStatus;

    private String itemStatus;

}
