package com.devil.renting.web.admin.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.devil.renting.model.entity.RoomInfo;
import com.devil.renting.web.admin.vo.room.RoomDetailVo;
import com.devil.renting.web.admin.vo.room.RoomItemVo;
import com.devil.renting.web.admin.vo.room.RoomQueryVo;
import com.devil.renting.web.admin.vo.room.RoomSubmitVo;

/**
* @author liubo
* @description 针对表【room_info(房间信息表)】的数据库操作Service
*/
public interface RoomInfoService extends IService<RoomInfo> {

    void saveOrUpdateRoom(RoomSubmitVo roomSubmitVo);

    IPage<RoomItemVo> pageRoomItemByQuery(IPage<RoomItemVo> page, RoomQueryVo queryVo);

    RoomDetailVo getRoomDetailById(Long id);

    void removeRoomById(Long id);
}
