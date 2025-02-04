package com.devil.renting.web.app.service;

import com.devil.renting.model.entity.PaymentType;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author liubo
* @description 针对表【payment_type(支付方式表)】的数据库操作Service
*/
public interface PaymentTypeService extends IService<PaymentType> {
    List<PaymentType> listByRoomId(Long id);
}
