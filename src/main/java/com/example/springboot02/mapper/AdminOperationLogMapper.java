package com.example.springboot02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot02.entity.AdminOperationLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminOperationLogMapper extends BaseMapper<AdminOperationLog> {
}
