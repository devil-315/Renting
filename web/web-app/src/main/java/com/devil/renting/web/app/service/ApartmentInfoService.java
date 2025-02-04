package com.devil.renting.web.app.service;

import com.devil.renting.model.entity.ApartmentInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.devil.renting.web.app.vo.apartment.ApartmentDetailVo;
import com.devil.renting.web.app.vo.apartment.ApartmentItemVo;

/**
 * @author liubo
 * @description 针对表【apartment_info(公寓信息表)】的数据库操作Service
 */
public interface ApartmentInfoService extends IService<ApartmentInfo> {
    ApartmentItemVo selectApartmentItemVoById(Long apartmentId);

    ApartmentDetailVo getApartmentDetailById(Long id);
}
