package com.devil.renting.web.admin.vo.attr;

import com.devil.renting.model.entity.AttrKey;
import com.devil.renting.model.entity.AttrValue;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;


@Data
public class AttrKeyVo extends AttrKey {

    @Schema(description = "属性value列表")
    private List<AttrValue> attrValueList;
}
