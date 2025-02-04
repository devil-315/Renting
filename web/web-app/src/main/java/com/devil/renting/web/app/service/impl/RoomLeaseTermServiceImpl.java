package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.RoomLeaseTerm;
import com.devil.renting.web.app.service.RoomLeaseTermService;
import com.devil.renting.web.app.mapper.RoomLeaseTermMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【room_lease_term(房间租期管理表)】的数据库操作Service实现
*/
@Service
public class RoomLeaseTermServiceImpl extends ServiceImpl<RoomLeaseTermMapper, RoomLeaseTerm>
    implements RoomLeaseTermService{

}




