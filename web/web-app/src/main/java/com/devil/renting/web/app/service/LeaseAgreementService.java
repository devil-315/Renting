package com.devil.renting.web.app.service;

import com.devil.renting.model.entity.LeaseAgreement;
import com.baomidou.mybatisplus.extension.service.IService;
import com.devil.renting.model.entity.LeaseTerm;
import com.devil.renting.web.app.vo.agreement.AgreementDetailVo;
import com.devil.renting.web.app.vo.agreement.AgreementItemVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Service
*/
public interface LeaseAgreementService extends IService<LeaseAgreement> {
    List<AgreementItemVo> listItemByPhone(String phone);

    AgreementDetailVo getDetailById(Long id);

    List<LeaseTerm> listByRoomId(Long id);
}
