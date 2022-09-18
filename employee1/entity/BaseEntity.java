package com.atguigu.paymentdemo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

import java.util.Date;

@Data
public class BaseEntity {

    @TableId(value="id",type = IdType.AUTO)
    private String id;
    private Date createDate;
    private Date updateDate;
}
