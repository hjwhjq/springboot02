package com.example.springboot02.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Timestamp;

@Data
@TableName("admin_operation_log")
public class AdminOperationLog {
    @TableId(value = "num", type = IdType.AUTO)
    private Integer num;
    @TableField(value = "id")
    private Integer id;
    @TableField(value = "operation_type")
    private String operationType;
    @TableField(value = "operation_time")
    private Timestamp operationTime;
    @TableField(value = "operation_detail")
    private String operationDetail;
    @TableField(value = "operation_result")
    private Integer operationResult;
}
