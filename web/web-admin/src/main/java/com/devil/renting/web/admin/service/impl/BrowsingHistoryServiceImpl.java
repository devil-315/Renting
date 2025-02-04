package com.devil.renting.web.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.model.entity.BrowsingHistory;
import com.devil.renting.web.admin.mapper.BrowsingHistoryMapper;
import com.devil.renting.web.admin.service.BrowsingHistoryService;
import org.springframework.stereotype.Service;

/**
* @author liubo
* @description 针对表【browsing_history(浏览历史)】的数据库操作Service实现
*/
@Service
public class BrowsingHistoryServiceImpl extends ServiceImpl<BrowsingHistoryMapper, BrowsingHistory>
    implements BrowsingHistoryService {

}




