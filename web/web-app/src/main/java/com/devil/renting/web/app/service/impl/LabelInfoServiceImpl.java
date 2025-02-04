package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.LabelInfo;
import com.devil.renting.web.app.service.LabelInfoService;
import com.devil.renting.web.app.mapper.LabelInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【label_info(标签信息表)】的数据库操作Service实现
*/
@Service
public class LabelInfoServiceImpl extends ServiceImpl<LabelInfoMapper, LabelInfo>
    implements LabelInfoService{

}




