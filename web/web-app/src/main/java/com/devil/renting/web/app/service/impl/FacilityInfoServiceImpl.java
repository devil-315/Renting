package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.FacilityInfo;
import com.devil.renting.web.app.service.FacilityInfoService;
import com.devil.renting.web.app.mapper.FacilityInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【facility_info(配套信息表)】的数据库操作Service实现
*/
@Service
public class FacilityInfoServiceImpl extends ServiceImpl<FacilityInfoMapper, FacilityInfo>
    implements FacilityInfoService{

}




