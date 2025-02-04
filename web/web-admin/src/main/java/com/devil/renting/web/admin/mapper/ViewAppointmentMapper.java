package com.devil.renting.web.admin.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.devil.renting.model.entity.ViewAppointment;
import com.devil.renting.web.admin.vo.appointment.AppointmentQueryVo;
import com.devil.renting.web.admin.vo.appointment.AppointmentVo;

/**
* @author liubo
* @description 针对表【view_appointment(预约看房信息表)】的数据库操作Mapper
*/
public interface ViewAppointmentMapper extends BaseMapper<ViewAppointment> {

    IPage<AppointmentVo> pageAppointmentVo(Page<AppointmentVo> page, AppointmentQueryVo queryVo);

}




