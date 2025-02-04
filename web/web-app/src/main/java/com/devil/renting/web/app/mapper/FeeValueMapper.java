package com.devil.renting.web.app.mapper;

import com.devil.renting.model.entity.FeeValue;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.devil.renting.web.app.vo.fee.FeeValueVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Mapper
*/
public interface FeeValueMapper extends BaseMapper<FeeValue> {

    List<FeeValueVo> selectListByApartmentId(Long apartmentId);

}




