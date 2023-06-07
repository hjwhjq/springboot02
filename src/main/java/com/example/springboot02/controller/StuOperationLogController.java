package com.example.springboot02.controller;


import com.example.springboot02.entity.StuOperationLog;
import com.example.springboot02.service.StuOperationLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin//跨域
public class StuOperationLogController{

    @Autowired
    public StuOperationLogServiceImpl stuOperationLogService;

    @GetMapping("/getAllStuLog")
    public List<StuOperationLog> getAllStuLogs() {
        return stuOperationLogService.getAllStuLogs();
    }

    @GetMapping("/getOneStuLog{sno}")
    public List<StuOperationLog> getStuLog(@PathVariable("sno") Integer sno) {
        return stuOperationLogService.getStuLog(sno);
    }

    @PostMapping("/addStuLog")
    public StuOperationLog addOneStuLog(@RequestBody StuOperationLog stuOperationLog) {
        return stuOperationLogService.addOneStuLog(stuOperationLog);
    }
}
