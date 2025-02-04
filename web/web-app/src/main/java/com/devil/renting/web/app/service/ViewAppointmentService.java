package com.devil.renting.web.app.service;

import com.devil.renting.model.entity.ViewAppointment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.devil.renting.web.app.vo.appointment.AppointmentDetailVo;
import com.devil.renting.web.app.vo.appointment.AppointmentItemVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {
    List<AppointmentItemVo> listItemByUserId(Long userId);

    AppointmentDetailVo getDetailById(Long id);

}
