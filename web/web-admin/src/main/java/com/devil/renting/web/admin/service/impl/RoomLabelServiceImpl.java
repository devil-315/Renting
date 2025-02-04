package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.RoomLabel;
import com.devil.renting.web.admin.mapper.RoomLabelMapper;
import com.devil.renting.web.admin.service.RoomLabelService;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【room_label(房间&标签关联表)】的数据库操作Service实现
*/
@Service
public class RoomLabelServiceImpl extends ServiceImpl<RoomLabelMapper, RoomLabel>
    implements RoomLabelService {

}




