package com.devil.renting.web.app.service.impl;

import com.devil.renting.model.entity.PaymentType;
import com.devil.renting.web.app.mapper.PaymentTypeMapper;
import com.devil.renting.web.app.service.PaymentTypeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【payment_type(支付方式表)】的数据库操作Service实现
*/
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType>
    implements PaymentTypeService{

    @Autowired
    PaymentTypeMapper paymentTypeMapper;
    @Override
    public List<PaymentType> listByRoomId(Long id) {
        return paymentTypeMapper.selectListByRoomId(id);
    }
}




