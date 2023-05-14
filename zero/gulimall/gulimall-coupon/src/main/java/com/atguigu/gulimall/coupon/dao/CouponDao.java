package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenshun
 * @email sulightcs@gmail.com
 * @date 2023-05-14 16:01:04
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
