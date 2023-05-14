package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author chenshun
 * @email sulightcs@gmail.com
 * @date 2023-05-14 16:28:16
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
