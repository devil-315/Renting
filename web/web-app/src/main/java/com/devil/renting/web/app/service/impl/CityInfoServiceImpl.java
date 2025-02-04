package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.CityInfo;
import com.devil.renting.web.app.service.CityInfoService;
import com.devil.renting.web.app.mapper.CityInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【city_info】的数据库操作Service实现
*/
@Service
public class CityInfoServiceImpl extends ServiceImpl<CityInfoMapper, CityInfo>
    implements CityInfoService{

}




