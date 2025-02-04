package com.devil.renting.web.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.devil.renting.model.entity.AttrKey;
import com.devil.renting.web.admin.vo.attr.AttrKeyVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【attr_key(房间基本属性表)】的数据库操作Service
*/
public interface AttrKeyService extends IService<AttrKey> {

    List<AttrKeyVo> listAttrInfo();
}
