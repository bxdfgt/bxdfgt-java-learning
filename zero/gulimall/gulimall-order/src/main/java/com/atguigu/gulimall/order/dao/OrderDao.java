package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenshun
 * @email sulightcs@gmail.com
 * @date 2023-05-14 16:28:16
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
