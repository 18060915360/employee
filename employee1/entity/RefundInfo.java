package com.atguigu.paymentdemo.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("t_refund_info")
public class RefundInfo extends BaseEntity{
    private String order_no;//'商户订单编号',
    private String refund_no;//'退款订单编号',
    private String refund_id;//'退款订单id',
    private String total_fee;//'订单金额（分）',
    private String refund;//'退款',
    private String reason;//'退款原因',
    private String refund_tatus;//'退款状态',
    private String content_return;//'信息内容',
    private String content_notify;//'信息提示',
}
