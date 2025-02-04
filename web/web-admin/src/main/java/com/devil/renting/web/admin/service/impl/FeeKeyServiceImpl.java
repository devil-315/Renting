package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.FeeKey;
import com.devil.renting.web.admin.mapper.FeeKeyMapper;
import com.devil.renting.web.admin.service.FeeKeyService;
import com.devil.renting.web.admin.vo.fee.FeeKeyVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author liubo
* @description 针对表【fee_key(杂项费用名称表)】的数据库操作Service实现
*/
@Service
public class FeeKeyServiceImpl extends ServiceImpl<FeeKeyMapper, FeeKey>
    implements FeeKeyService {

    @Autowired
    private FeeKeyMapper mapper;
    @Override
    public List<FeeKeyVo> listFeeInfo() {
        return mapper.listFeeInfo();
    }
}




