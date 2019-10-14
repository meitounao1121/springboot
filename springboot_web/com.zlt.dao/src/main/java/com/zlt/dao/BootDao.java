package com.zlt.dao;

import com.zlt.pojo.ClassEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BootDao {
    List<ClassEntity> showAll();
}
