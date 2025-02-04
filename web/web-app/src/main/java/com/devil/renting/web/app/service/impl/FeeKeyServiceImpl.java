package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.FeeKey;
import com.devil.renting.web.app.service.FeeKeyService;
import com.devil.renting.web.app.mapper.FeeKeyMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service实现
*/
@Service
public class FeeKeyServiceImpl extends ServiceImpl<FeeKeyMapper, FeeKey>
    implements FeeKeyService{

}




