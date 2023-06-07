package com.example.springboot02.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@TableName("stu_opinion_table")
public class StuOpinionTable {
    @TableId(value = "num", type = IdType.AUTO)
    private Integer num;
    @TableField(value = "sno")
    private Integer sno;
    @TableField(value = "type")
    private String type;
    @TableField(value = "content")
    private String content;
    @TableField(value = "date")
    private Timestamp date;
}
