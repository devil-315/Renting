package com.devil.renting.web.app.mapper;

import com.devil.renting.model.entity.RoomInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.devil.renting.web.app.vo.room.RoomItemVo;
import com.devil.renting.web.app.vo.room.RoomQueryVo;

import java.math.BigDecimal;

/**
* @author liubo
* @description 针对表【room_info(房间信息表)】的数据库操作Mapper
*/
public interface RoomInfoMapper extends BaseMapper<RoomInfo> {

    IPage<RoomItemVo> pageRoomItemByQuery(Page<RoomItemVo> page, RoomQueryVo queryVo);

    IPage<RoomItemVo> pageItemByApartmentId(IPage<RoomItemVo> page, Long id);

    BigDecimal selectMinRentByApartmentId(Long id);
}