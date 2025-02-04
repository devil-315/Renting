package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.LeaseTerm;
import com.devil.renting.web.admin.mapper.LeaseTermMapper;
import com.devil.renting.web.admin.service.LeaseTermService;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【lease_term(租期)】的数据库操作Service实现
*/
@Service
public class LeaseTermServiceImpl extends ServiceImpl<LeaseTermMapper, LeaseTerm>
    implements LeaseTermService {

}




