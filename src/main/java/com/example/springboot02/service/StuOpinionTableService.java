package com.example.springboot02.service;

import com.example.springboot02.entity.StuOpinionTable;

import java.util.List;
import java.util.Map;

public interface StuOpinionTableService {

    List<StuOpinionTable> getAllTable();
    List<Map<String, Object>> getTableData();
    List<StuOpinionTable> getDetail(String type);
    StuOpinionTable addStuOpinion(StuOpinionTable stuOpinionTable);
}
