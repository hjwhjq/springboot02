package com.example.springboot02.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.springboot02.entity.StuOpinionTable;
import com.example.springboot02.mapper.StuOpinionTableMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StuOpinionTableServiceImpl implements StuOpinionTableService {

    @Autowired
    StuOpinionTableMapper stuOpinionTableMapper;

    //查询出所有的意见信息
    @Override
    public List<StuOpinionTable> getAllTable() {
        return stuOpinionTableMapper.selectList(null);
    }

    //根据意见类型进行分类
    @Override
    public List<Map<String, Object>> getTableData(){
        QueryWrapper<StuOpinionTable> queryWrapper=new QueryWrapper<>();
        queryWrapper.select("type,count(*) as count")
                .groupBy("type");
        return stuOpinionTableMapper.selectMaps(queryWrapper);
    }

    //查看具体的某一意见的全部内容
    @Override
    public List<StuOpinionTable> getDetail(String type){
        QueryWrapper<StuOpinionTable> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("type",type);
        return stuOpinionTableMapper.selectList(queryWrapper);
    }

    //添加意见
    @Override
    public StuOpinionTable addStuOpinion(StuOpinionTable stuOpinionTable){
        System.out.println(123);
        System.out.println(stuOpinionTable);
        stuOpinionTableMapper.insert(stuOpinionTable);
        System.out.println(123);
        return stuOpinionTable;
    }
}
