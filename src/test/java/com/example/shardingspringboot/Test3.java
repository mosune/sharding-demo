package com.example.shardingspringboot;

import com.example.shardingspringboot.entity.Order;
import com.example.shardingspringboot.repo.OrderRepo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * 读写分离
 *
 * @author gcg
 * @create 2020-03-29 17:15
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingSpringbootApplication.class)
public class Test3 {

    @Autowired
    private OrderRepo orderRepo;

    /**
     * 保存(走主库)
     */
    @Test
    public void saveList() {
        List<Order> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(Order.builder().orderId(i).userId(i).status("status" + i).build());
        }
        orderRepo.saveList(list);
    }

    /**
     * 查询所有数据（走从库）
     */
    @Test
    public void getList() {
        List<Order> list = orderRepo.getList(null, null, null);
        System.out.println("结果为" + list);
    }

}
