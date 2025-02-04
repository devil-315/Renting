package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.ViewAppointment;
import com.devil.renting.web.admin.mapper.ViewAppointmentMapper;
import com.devil.renting.web.admin.service.ViewAppointmentService;
import com.devil.renting.web.admin.vo.appointment.AppointmentQueryVo;
import com.devil.renting.web.admin.vo.appointment.AppointmentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liubo
 * @description 针对表【view_appointment(预约看房信息表)】的数据库操作Service实现
 */
@Service
public class ViewAppointmentServiceImpl extends ServiceImpl<ViewAppointmentMapper, ViewAppointment>
        implements ViewAppointmentService {

    @Autowired
    private ViewAppointmentMapper viewAppointmentMapper;
    @Override
    public IPage<AppointmentVo> pageAppointmentVo(Page<AppointmentVo> page, AppointmentQueryVo queryVo) {
        return viewAppointmentMapper.pageAppointmentVo(page,queryVo);
    }
}




