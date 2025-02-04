package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.GraphInfo;
import com.devil.renting.web.app.service.GraphInfoService;
import com.devil.renting.web.app.mapper.GraphInfoMapper;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【graph_info(图片信息表)】的数据库操作Service实现
*/
@Service
public class GraphInfoServiceImpl extends ServiceImpl<GraphInfoMapper, GraphInfo>
    implements GraphInfoService{

}




