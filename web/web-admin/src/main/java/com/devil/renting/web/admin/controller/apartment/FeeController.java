package com.devil.renting.web.admin.controller.apartment;


import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.devil.renting.common.result.Result;
import com.devil.renting.model.entity.FeeKey;
import com.devil.renting.model.entity.FeeValue;
import com.devil.renting.web.admin.service.FeeKeyService;
import com.devil.renting.web.admin.service.FeeValueService;
import com.devil.renting.web.admin.vo.fee.FeeKeyVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "房间杂费管理")
@RestController
@RequestMapping("/admin/fee")
public class FeeController {

    @Autowired
    private FeeKeyService feeKeyService;

    @Autowired
    private FeeValueService feeValueService;

    @Operation(summary = "保存或更新杂费名称")
    @PostMapping("key/saveOrUpdate")
    public Result saveOrUpdateFeeKey(@RequestBody FeeKey feeKey) {
        feeKeyService.saveOrUpdate(feeKey);
        return Result.ok();
    }

    @Operation(summary = "保存或更新杂费值")
    @PostMapping("value/saveOrUpdate")
    public Result saveOrUpdateFeeValue(@RequestBody FeeValue feeValue) {
        feeValueService.saveOrUpdate(feeValue);
        return Result.ok();
    }


    @Operation(summary = "查询全部杂费名称和杂费值列表")
    @GetMapping("list")
    public Result<List<FeeKeyVo>> feeInfoList() {
        List<FeeKeyVo> list = feeKeyService.listFeeInfo();
        return Result.ok(list);
    }

    @Operation(summary = "根据id删除杂费名称")
    @DeleteMapping("key/deleteById")
    public Result deleteFeeKeyById(@RequestParam Long feeKeyId) {
        //删除杂费名称
        feeKeyService.removeById(feeKeyId);

        //删除杂费名称下的杂费值
        LambdaQueryWrapper<FeeValue> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(FeeValue::getFeeKeyId, feeKeyId);
        feeValueService.remove(queryWrapper);
        return Result.ok();
    }

    @Operation(summary = "根据id删除杂费值")
    @DeleteMapping("value/deleteById")
    public Result deleteFeeValueById(@RequestParam Long id) {
        feeValueService.removeById(id);
        return Result.ok();
    }
}
