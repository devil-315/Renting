package com.devil.renting.web.admin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.devil.renting.model.entity.FeeValue;
import com.devil.renting.web.admin.vo.fee.FeeValueVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Mapper
*/
public interface FeeValueMapper extends BaseMapper<FeeValue> {

    List<FeeValueVo> selectListByApartmentId(Long id);
}




