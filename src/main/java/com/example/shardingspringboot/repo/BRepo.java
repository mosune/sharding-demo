package com.example.shardingspringboot.repo;

import com.example.shardingspringboot.entity.B;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * b的repo
 *
 * @author gcg
 * @create 2020-03-29 15:23
 **/
@Repository
public interface BRepo {

    void saveList(List<B> list);
}
