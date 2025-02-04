package com.devil.renting.web.app.mapper;

import com.devil.renting.model.entity.ViewAppointment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.devil.renting.web.app.vo.appointment.AppointmentItemVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Mapper
*/
public interface ViewAppointmentMapper extends BaseMapper<ViewAppointment> {

    List<AppointmentItemVo> listItemByUserId(Long userId);
}




