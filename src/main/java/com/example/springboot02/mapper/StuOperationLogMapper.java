package com.example.springboot02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot02.entity.StuOperationLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuOperationLogMapper extends BaseMapper<StuOperationLog> {
}
