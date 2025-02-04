package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.FeeValue;
import com.devil.renting.web.admin.mapper.FeeValueMapper;
import com.devil.renting.web.admin.service.FeeValueService;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【fee_value(杂项费用值表)】的数据库操作Service实现
*/
@Service
public class FeeValueServiceImpl extends ServiceImpl<FeeValueMapper, FeeValue>
    implements FeeValueService {

}




