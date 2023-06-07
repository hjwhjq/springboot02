package com.example.springboot02.service;

import com.example.springboot02.entity.AdminOperationLog;

import java.util.List;

public interface AdminOperationLogService {
    List<AdminOperationLog> getAllAdminOperationLog();
    List<AdminOperationLog> getOneAdminLog(Integer id);
    //增加管理员操作日志
    AdminOperationLog addAdminLog(AdminOperationLog adminOperationLog);
}
