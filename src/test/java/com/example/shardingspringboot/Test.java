package com.example.shardingspringboot;

import com.example.shardingspringboot.entity.OrderItem;
import com.example.shardingspringboot.repo.OrderItemRepo;
import com.example.shardingspringboot.repo.OrderRepo;
import com.example.shardingspringboot.entity.Order;
import com.example.shardingspringboot.vo.OrderItemVo;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据分片test
 *
 * @author gcg
 * @create 2020-03-28 15:29
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ShardingSpringbootApplication.class)
public class Test {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private OrderItemRepo orderItemRepo;

    /**
     * 保存
     */
    @org.junit.Test
    public void saveList() {
        List<Order> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(Order.builder().orderId(i).userId(i).status("status" + i).build());
        }
        orderRepo.saveList(list);
    }

    /**
     * 保存
     */
    @org.junit.Test
    public void saveItemList() {
        List<OrderItem> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(OrderItem.builder().orderId((long) i).userId(i).status("status" + i).build());
        }
        orderItemRepo.saveList(list);
    }

    /**
     * 查询所有数据
     */
    @org.junit.Test
    public void getList() {
        List<Order> list = orderRepo.getList(null, null, null);
        System.out.println("结果为" + list);
    }

    /**
     * 条件查询
     */
    @org.junit.Test
    public void getListWhere() {
        List<Order> list = orderRepo.getList(2, null, null);
        System.out.println("结果为" + list);
    }

    /**
     * 分页查询
     */
    @org.junit.Test
    public void getListLimit() {
        List<Order> list = orderRepo.getList(null, 0, 10);
        System.out.println("结果为" + list);
    }

    /**
     * 连表查询
     */
    @org.junit.Test
    public void getJoinListLimit() {
        List<OrderItemVo> list = orderRepo.getJoinList();
        System.out.println("结果为" + list);
    }

    /**
     * 查询所有数据（强制路由）
     */
    @org.junit.Test
    public void getHintList() {
        HintManager hintManager = HintManager.getInstance();
        hintManager.addTableShardingValue("t_order", null);
        List<Order> list = orderRepo.getList(null, null, null);
        System.out.println("结果为" + list);
        hintManager.close();
    }

}
