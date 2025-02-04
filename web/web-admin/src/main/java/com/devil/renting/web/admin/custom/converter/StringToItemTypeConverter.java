package com.devil.renting.web.admin.custom.converter;

import com.devil.renting.model.enums.ItemType;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * ClassName：StringToItemTypeConverter
 *
 * @author: Devil
 * @Date: 2025/1/31
 * @Description:
 * @version: 1.0
 */
@Component
public class StringToItemTypeConverter implements Converter<String, ItemType> {
    @Override
    public ItemType convert(String code) {
//        if ("1".equals(code)){
//            return ItemType.APARTMENT;
//        } else if ("2".equals(code)) {
//            return ItemType.ROOM;
//        }
        for (ItemType value : ItemType.values()) {
            if (value.getCode().equals(Integer.valueOf(code))) {
                return value;
            }
        }
        throw new IllegalArgumentException("code" + code + "非法");
    }
}
