package com.atguigu.paymentdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_product")
public class Product extends BaseEntity{
    private String title;// 商品名称
    private Integer price;// 商品价格
    private String name2;
}
