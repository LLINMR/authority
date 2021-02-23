package com.jonsson.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jonsson.entity.MenuList;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MenuListDao extends BaseMapper<MenuList> {
    List<MenuList> findByParent(Long parent);

    List<MenuList> findByParentNull();
}