package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author chenshun
 * @email sulightcs@gmail.com
 * @date 2023-05-14 16:30:41
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
