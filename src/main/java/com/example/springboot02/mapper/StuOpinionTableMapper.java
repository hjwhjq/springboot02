package com.example.springboot02.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.springboot02.entity.StuOpinionTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface StuOpinionTableMapper extends BaseMapper<StuOpinionTable> {



    //根据意见类型进行分类
    /*@Select("select type,count(type) num from stu_opinion_table group by type")
    Map<String,Integer> getTableData();*/
}
