package com.example.shardingspringboot;

import com.example.shardingspringboot.entity.A;
import com.example.shardingspringboot.entity.B;
import com.example.shardingspringboot.repo.ARepo;
import com.example.shardingspringboot.repo.BRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * 垂直拆分
 *
 * @author gcg
 * @create 2020-03-29 15:25
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingSpringbootApplication.class)
public class Test2 {

    @Autowired
    private ARepo aRepo;

    @Autowired
    private BRepo bRepo;

    /**
     * a的插入
     */
    @Test
    public void saveAList() {
        List<A> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(A.builder().status("status" + i).build());
        }
        aRepo.saveList(list);
    }

    /**
     * b的插入
     */
    @Test
    public void saveBList() {
        List<B> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(B.builder().aid((long) (i + 1)).status("status" + i).build());
        }
        bRepo.saveList(list);
    }

}
