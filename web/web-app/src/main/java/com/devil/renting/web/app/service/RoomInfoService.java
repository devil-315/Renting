package com.devil.renting.web.app.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.devil.renting.model.entity.RoomInfo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.devil.renting.web.app.vo.room.RoomDetailVo;
import com.devil.renting.web.app.vo.room.RoomItemVo;
import com.devil.renting.web.app.vo.room.RoomQueryVo;

/**
* @author liubo
* @description 针对表【room_info(房间信息表)】的数据库操作Service
*/
public interface RoomInfoService extends IService<RoomInfo> {
    IPage<RoomItemVo> pageRoomItemByQuery(Page<RoomItemVo> page, RoomQueryVo queryVo);

    RoomDetailVo getDetailById(Long id);

    IPage<RoomItemVo> pageItemByApartmentId(IPage<RoomItemVo> page, Long id);
}
