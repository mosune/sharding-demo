package com.example.shardingspringboot.repo;

import com.example.shardingspringboot.entity.A;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * a的repo
 *
 * @author gcg
 * @create 2020-03-29 15:23
 **/
@Repository
public interface ARepo {

    void saveList(List<A> list);
}
