package com.example.shardingspringboot.hint;

import org.apache.shardingsphere.api.sharding.hint.HintShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.hint.HintShardingValue;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 强制路由算法
 *
 * @author gcg
 * @create 2020-03-29 16:52
 **/
public class OrderHintManager implements HintShardingAlgorithm<String> {

    @Override
    public Collection<String> doSharding(Collection<String> availableTargetNames, HintShardingValue<String> shardingValue) {
        Collection<String> result = new ArrayList<>();
        // 所有切片强制执行到t_order0库，同理可以设置库的hint
        result.add("t_order0");
        return result;
    }
}
