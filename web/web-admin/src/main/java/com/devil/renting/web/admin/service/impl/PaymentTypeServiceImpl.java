package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.PaymentType;
import com.devil.renting.web.admin.mapper.PaymentTypeMapper;
import com.devil.renting.web.admin.service.PaymentTypeService;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【payment_type(支付方式表)】的数据库操作Service实现
*/
@Service
public class PaymentTypeServiceImpl extends ServiceImpl<PaymentTypeMapper, PaymentType>
    implements PaymentTypeService {

}




