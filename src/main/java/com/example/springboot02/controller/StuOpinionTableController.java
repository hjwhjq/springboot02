package com.example.springboot02.controller;

import com.example.springboot02.entity.StuOpinionTable;
import com.example.springboot02.service.StuOpinionTableServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin//跨域
@RequestMapping("/stuopinion")
public class StuOpinionTableController {

    @Autowired
    public StuOpinionTableServiceImpl stuOpinionTableService;
    //获取全部意见数据

    @GetMapping("/getAllTable")
    public List<StuOpinionTable> getAllTable() {
        return stuOpinionTableService.getAllTable();
    }

    //根据意见类型进行分类
    @GetMapping("/getTableData")
    public List<Map<String, Object>> getTableData(){
        return stuOpinionTableService.getTableData();
    }

    @GetMapping("/getTableDetail{type}")
    public List<StuOpinionTable> getDetail(@PathVariable("type") String type) {
        return stuOpinionTableService.getDetail(type);
    }

    @PostMapping("/addOpinion")
    public StuOpinionTable addStuOpinion(@RequestBody StuOpinionTable stuOpinionTable) {
        stuOpinionTableService.addStuOpinion(stuOpinionTable);
        return stuOpinionTable;
    }
}
