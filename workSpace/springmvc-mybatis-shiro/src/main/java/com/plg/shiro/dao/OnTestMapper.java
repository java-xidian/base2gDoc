package com.plg.shiro.dao;

import com.plg.shiro.entity.OnTest;

public interface OnTestMapper {
    int insert(OnTest record);

    int insertSelective(OnTest record);
}