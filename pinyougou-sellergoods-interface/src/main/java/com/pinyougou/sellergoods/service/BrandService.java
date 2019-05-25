package com.pinyougou.sellergoods.service;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

/**
 * Created by RookieLi on 2019/5/25.
 */
public interface BrandService {

    /**
     * 返回全部列表
     * @return
     */
    List<TbBrand> findAll();
}
