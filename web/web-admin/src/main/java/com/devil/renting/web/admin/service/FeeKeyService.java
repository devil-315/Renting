package com.devil.renting.web.admin.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.devil.renting.model.entity.FeeKey;
import com.devil.renting.web.admin.vo.fee.FeeKeyVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service
*/
public interface FeeKeyService extends IService<FeeKey> {

    List<FeeKeyVo> listFeeInfo();

}
