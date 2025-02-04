package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.AttrValue;
import com.devil.renting.web.app.service.AttrValueService;
import com.devil.renting.web.app.mapper.AttrValueMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【attr_value(房间基本属性值表)】的数据库操作Service实现
 */
@Service
public class AttrValueServiceImpl extends ServiceImpl<AttrValueMapper, AttrValue>
    implements AttrValueService{

}




