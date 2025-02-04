package com.devil.renting.web.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.devil.renting.model.entity.LeaseAgreement;
import com.devil.renting.web.admin.vo.agreement.AgreementQueryVo;
import com.devil.renting.web.admin.vo.agreement.AgreementVo;

/**
* @author liubo
* @description 针对表【lease_agreement(租约信息表)】的数据库操作Mapper
*/
public interface LeaseAgreementMapper extends BaseMapper<LeaseAgreement> {

    IPage<AgreementVo> pageAgreementVo(Page<AgreementVo> page, AgreementQueryVo queryVo);
}




