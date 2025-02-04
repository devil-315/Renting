package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.ApartmentFacility;
import com.devil.renting.web.admin.mapper.ApartmentFacilityMapper;
import com.devil.renting.web.admin.service.ApartmentFacilityService;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【apartment_facility(公寓&配套关联表)】的数据库操作Service实现
*/
@Service
public class ApartmentFacilityServiceImpl extends ServiceImpl<ApartmentFacilityMapper, ApartmentFacility>
    implements ApartmentFacilityService {

}




