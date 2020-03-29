package com.example.shardingspringboot.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * b
 *
 * @author gcg
 * @create 2020-03-29 15:25
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class B {

    private Long id;

    private Long aid;

    private String status;

}
