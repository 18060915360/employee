package com.atguigu.paymentdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_payment_info")
public class PaymentInfo extends BaseEntity{
    private String orderNo;//` varchar(50) NOT NULL DEFAULT '' COMMENT '订单号',
    private String transactionId;//` varchar(50) DEFAULT NULL COMMENT '课程名称',
    private String paymentType;//` varchar(20) DEFAULT NULL COMMENT '支付类型（1：微信 2：支付宝）',
    private String tradeType;//` varchar(20) DEFAULT NULL COMMENT '讲师名称',
    private String tradeState;//` varchar(50)  DEFAULT NULL COMMENT '订单状态（0：未支付 1：已支付）',
    private Integer payerTotal;//` int(11) DEFAULT NULL COMMENT '会员昵称',
    private String content;//text DEFAULT NULL COMMENT '会员手机',
}
