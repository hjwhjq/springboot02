package com.example.springboot02.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot02.controller.AdminOperationLogController;
import com.example.springboot02.entity.AdminOperationLog;
import com.example.springboot02.mapper.AdminOperationLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class AdminOperationLogServiceImpl implements AdminOperationLogService{

    @Autowired
    AdminOperationLogMapper adminOperationLogMapper;

    //获取所有管理员的操作日志
    @Override
    public List<AdminOperationLog> getAllAdminOperationLog(){
        return adminOperationLogMapper.selectList(null);
    }

    //获取某个管理员的操作日志
    @Override
    public List<AdminOperationLog> getOneAdminLog( Integer id){
        QueryWrapper<AdminOperationLog> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return adminOperationLogMapper.selectList(queryWrapper);
    }

    //增加管理员操作日志
    @Override
    public AdminOperationLog addAdminLog( AdminOperationLog adminOperationLog){
        adminOperationLogMapper.insert(adminOperationLog);
        return adminOperationLog;
    }




}
