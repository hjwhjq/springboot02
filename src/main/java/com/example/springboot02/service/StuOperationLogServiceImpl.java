package com.example.springboot02.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot02.controller.StuOperationLogController;
import com.example.springboot02.entity.StuOperationLog;
import com.example.springboot02.mapper.StuOperationLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class StuOperationLogServiceImpl implements StuOperationLogService{

    @Autowired
    StuOperationLogMapper stuOperationLogMapper;

    //查询所有学生的操作日志
    @Override
    public List<StuOperationLog> getAllStuLogs(){
        return stuOperationLogMapper.selectList(null);
    }

    //查询某个学生的操作日志
    @Override
    public List<StuOperationLog> getStuLog( Integer sno){
        QueryWrapper<StuOperationLog> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("sno",sno);
        return stuOperationLogMapper.selectList(queryWrapper);
    }

    //增加学生操作日志
    @Override
    public StuOperationLog addOneStuLog( StuOperationLog stuOperationLog){
        stuOperationLogMapper.insert(stuOperationLog);
        return stuOperationLog;
    }
}
