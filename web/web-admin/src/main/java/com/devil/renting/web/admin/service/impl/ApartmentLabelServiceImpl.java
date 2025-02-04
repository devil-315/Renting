package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.ApartmentLabel;
import com.devil.renting.web.admin.mapper.ApartmentLabelMapper;
import com.devil.renting.web.admin.service.ApartmentLabelService;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【apartment_label(公寓标签关联表)】的数据库操作Service实现
*/
@Service
public class ApartmentLabelServiceImpl extends ServiceImpl<ApartmentLabelMapper, ApartmentLabel>
    implements ApartmentLabelService {

}




