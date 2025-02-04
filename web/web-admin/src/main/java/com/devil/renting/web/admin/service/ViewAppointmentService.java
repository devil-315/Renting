package com.devil.renting.web.admin.service;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.devil.renting.model.entity.ViewAppointment;
import com.devil.renting.web.admin.vo.appointment.AppointmentQueryVo;
import com.devil.renting.web.admin.vo.appointment.AppointmentVo;

/**
* @author liubo
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service
*/
public interface ViewAppointmentService extends IService<ViewAppointment> {

    IPage<AppointmentVo> pageAppointmentVo(Page<AppointmentVo> page, AppointmentQueryVo queryVo);
}
