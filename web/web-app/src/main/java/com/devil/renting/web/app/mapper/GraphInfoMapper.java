package com.devil.renting.web.app.mapper;

import com.devil.renting.model.entity.GraphInfo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.devil.renting.model.enums.ItemType;
import com.devil.renting.web.app.vo.graph.GraphVo;

import java.util.List;

/**
* @author liubo
* @description 针对表【graph_info(图片信息表)】的数据库操作Mapper
*/
public interface GraphInfoMapper extends BaseMapper<GraphInfo> {

    List<GraphVo> selectListByItemTypeAndId(ItemType itemType, Long id);
}




