package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.devil.renting.model.entity.BrowsingHistory;
import com.devil.renting.web.app.mapper.BrowsingHistoryMapper;
import com.devil.renting.web.app.service.BrowsingHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.web.app.vo.history.HistoryItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author liubo
 * @description 针对表【browsing_history(浏览历史)】的数据库操作Service实现
 */
@Service
public class BrowsingHistoryServiceImpl extends ServiceImpl<BrowsingHistoryMapper, BrowsingHistory>
        implements BrowsingHistoryService {
    @Autowired
    private BrowsingHistoryMapper browsingHistoryMapper;
    @Override
    public IPage<HistoryItemVo> pageItemByUserId(Page<HistoryItemVo> page, Long userId) {
        return browsingHistoryMapper.pageItemByUserId(page,userId);
    }

    @Override
    @Async
    public void saveHistory(Long userId, Long id) {
//        System.out.println("保存浏览历史-" + Thread.currentThread().getName());
        LambdaQueryWrapper<BrowsingHistory> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(BrowsingHistory::getUserId,userId)
                    .eq(BrowsingHistory::getRoomId,id);
        BrowsingHistory browsingHistory = browsingHistoryMapper.selectOne(queryWrapper);
        if (browsingHistory != null){
            browsingHistory.setBrowseTime(new Date());
            browsingHistoryMapper.updateById(browsingHistory);
        }else {
            BrowsingHistory history = new BrowsingHistory();
            history.setUserId(userId);
            history.setRoomId(id);
            history.setBrowseTime(new Date());
            browsingHistoryMapper.insert(history);
        }
    }
}