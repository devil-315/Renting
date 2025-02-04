package com.devil.renting.web.admin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.devil.renting.model.entity.AttrKey;
import com.devil.renting.web.admin.vo.attr.AttrKeyVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Mapper
*/
public interface AttrKeyMapper extends BaseMapper<AttrKey> {

    List<AttrKeyVo> listAttrInfo();

}




