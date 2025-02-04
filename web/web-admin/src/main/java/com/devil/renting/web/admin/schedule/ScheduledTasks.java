package com.devil.renting.web.admin.schedule;

import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.devil.renting.model.entity.LeaseAgreement;
import com.devil.renting.model.enums.LeaseStatus;
import com.devil.renting.web.admin.service.LeaseAgreementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * ClassName：ScheduledTasks
 *
 * @author: Devil
 * @Date: 2025/2/1
 * @Description:
 * @version: 1.0
 */
@Component
public class ScheduledTasks {
//    @Scheduled(cron = "* * * * * *")
//    public void test(){
//        System.out.println(new Date());
//    }
    @Autowired
    private LeaseAgreementService service;
    @Scheduled(cron = "0 0 0 * * *")
    public void checkLeaseStatus(){
        LambdaUpdateWrapper<LeaseAgreement> updateWrapper = new LambdaUpdateWrapper<>();
        updateWrapper.le(LeaseAgreement::getLeaseEndDate,new Date())
                .in(LeaseAgreement::getStatus,LeaseStatus.SIGNED,LeaseStatus.WITHDRAWING)
                .set(LeaseAgreement::getStatus, LeaseStatus.EXPIRED);
        service.update(updateWrapper);
    }
}
