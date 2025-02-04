package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.ProvinceInfo;
import com.devil.renting.web.app.service.ProvinceInfoService;
import com.devil.renting.web.app.mapper.ProvinceInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【province_info】的数据库操作Service实现
*/
@Service
public class ProvinceInfoServiceImpl extends ServiceImpl<ProvinceInfoMapper, ProvinceInfo>
    implements ProvinceInfoService{

}




