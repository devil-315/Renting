package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.RoomAttrValue;
import com.devil.renting.web.app.service.RoomAttrValueService;
import com.devil.renting.web.app.mapper.RoomAttrValueMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【room_attr_value(房间&基本属性值关联表)】的数据库操作Service实现
*/
@Service
public class RoomAttrValueServiceImpl extends ServiceImpl<RoomAttrValueMapper, RoomAttrValue>
    implements RoomAttrValueService{

}




