package com.example.springboot02.service;

import com.example.springboot02.entity.StuOperationLog;

import java.util.List;

public interface StuOperationLogService {
    public List<StuOperationLog> getAllStuLogs();
    public List<StuOperationLog> getStuLog(Integer sno);
    public StuOperationLog addOneStuLog(StuOperationLog stuOperationLog);
}
