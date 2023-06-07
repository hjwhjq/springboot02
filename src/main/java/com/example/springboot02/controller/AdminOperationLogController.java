package com.example.springboot02.controller;

import com.example.springboot02.entity.AdminOperationLog;
import com.example.springboot02.service.AdminOperationLogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin
@RestController
public class AdminOperationLogController {

    @Autowired
    public AdminOperationLogServiceImpl adminOperationLogService;

    @GetMapping("/getAdminLog")
    public List<AdminOperationLog> getAllAdminOperationLog() {
        return adminOperationLogService.getAllAdminOperationLog();
    }

    @GetMapping("/getOneAdminLog{id}")
    public List<AdminOperationLog> getOneAdminLog(@PathVariable("id") Integer id) {
        return adminOperationLogService.getOneAdminLog(id);
    }

    @PostMapping("/addAdminLog")
    public AdminOperationLog addAdminLog(@RequestBody AdminOperationLog adminOperationLog) {
        adminOperationLogService.addAdminLog(adminOperationLog);
        return adminOperationLog;
    }
}
