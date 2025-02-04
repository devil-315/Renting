package com.devil.renting.web.app.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.devil.renting.common.login.LoginUserHolder;
import com.devil.renting.model.entity.*;
import com.devil.renting.model.enums.ItemType;
import com.devil.renting.web.app.mapper.*;
import com.devil.renting.web.app.service.ApartmentInfoService;
import com.devil.renting.web.app.service.BrowsingHistoryService;
import com.devil.renting.web.app.service.RoomInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.devil.renting.web.app.vo.apartment.ApartmentItemVo;
import com.devil.renting.web.app.vo.attr.AttrValueVo;
import com.devil.renting.web.app.vo.fee.FeeValueVo;
import com.devil.renting.web.app.vo.graph.GraphVo;
import com.devil.renting.web.app.vo.room.RoomDetailVo;
import com.devil.renting.web.app.vo.room.RoomItemVo;
import com.devil.renting.web.app.vo.room.RoomQueryVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author liubo
 * @description 针对表【room_info(房间信息表)】的数据库操作Service实现
 */
@Service
@Slf4j
public class RoomInfoServiceImpl extends ServiceImpl<RoomInfoMapper, RoomInfo>
        implements RoomInfoService {

    @Autowired
    RoomInfoMapper roomInfoMapper;

    @Autowired
    GraphInfoMapper graphInfoMapper;

    @Autowired
    LeaseTermMapper leaseTermMapper;

    @Autowired
    FacilityInfoMapper facilityInfoMapper;

    @Autowired
    LabelInfoMapper labelInfoMapper;

    @Autowired
    PaymentTypeMapper paymentTypeMapper;

    @Autowired
    AttrValueMapper attrValueMapper;

    @Autowired
    FeeValueMapper feeValueMapper;

    @Autowired
    ApartmentInfoService apartmentInfoService;

    @Autowired
    BrowsingHistoryService browsingHistoryService;

    @Override
    public IPage<RoomItemVo> pageRoomItemByQuery(Page<RoomItemVo> page, RoomQueryVo queryVo) {
        return roomInfoMapper.pageRoomItemByQuery(page, queryVo);
    }

    @Override
    public RoomDetailVo getDetailById(Long id) {
        //1.查询房间信息
        RoomInfo roomInfo = roomInfoMapper.selectById(id);
        if (roomInfo == null) {
            return null;
        }
        //2.查询图片
        List<GraphVo> graphVoList = graphInfoMapper.selectListByItemTypeAndId(ItemType.ROOM, id);
        //3.查询租期
        List<LeaseTerm> leaseTermList = leaseTermMapper.selectListByRoomId(id);
        //4.查询配套
        List<FacilityInfo> facilityInfoList = facilityInfoMapper.selectListByRoomId(id);
        //5.查询标签
        List<LabelInfo> labelInfoList = labelInfoMapper.selectListByRoomId(id);
        //6.查询支付方式
        List<PaymentType> paymentTypeList = paymentTypeMapper.selectListByRoomId(id);
        //7.查询基本属性
        List<AttrValueVo> attrValueVoList = attrValueMapper.selectListByRoomId(id);
        //8.查询杂费信息
        List<FeeValueVo> feeValueVoList = feeValueMapper.selectListByApartmentId(roomInfo.getApartmentId());
        //9.查询公寓信息
        ApartmentItemVo apartmentItemVo = apartmentInfoService.selectApartmentItemVoById(roomInfo.getApartmentId());

        RoomDetailVo roomDetailVo = new RoomDetailVo();
        BeanUtils.copyProperties(roomInfo, roomDetailVo);

        roomDetailVo.setApartmentItemVo(apartmentItemVo);
        roomDetailVo.setGraphVoList(graphVoList);
        roomDetailVo.setAttrValueVoList(attrValueVoList);
        roomDetailVo.setFacilityInfoList(facilityInfoList);
        roomDetailVo.setLabelInfoList(labelInfoList);
        roomDetailVo.setPaymentTypeList(paymentTypeList);
        roomDetailVo.setFeeValueVoList(feeValueVoList);
        roomDetailVo.setLeaseTermList(leaseTermList);
//        System.out.println("获取房间详情-" + Thread.currentThread().getName());
        //保存浏览历史
        browsingHistoryService.saveHistory(LoginUserHolder.getLoginUser().getUserId(), id);
        return roomDetailVo;
    }

    @Override
    public IPage<RoomItemVo> pageItemByApartmentId(IPage<RoomItemVo> page, Long id) {
        return  roomInfoMapper.pageItemByApartmentId(page, id);
    }
}




