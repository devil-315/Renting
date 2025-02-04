package com.devil.renting.web.admin.custom.converter;

import com.devil.renting.model.enums.BaseEnum;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.converter.ConverterFactory;
import org.springframework.stereotype.Component;

/**
 * ClassName：StringToBaseEnumConverterFactory
 *
 * @author: Devil
 * @Date: 2025/1/31
 * @Description:
 * @version: 1.0
 */
@Component
public class StringToBaseEnumConverterFactory implements ConverterFactory<String , BaseEnum> {

    @Override
    public <T extends BaseEnum> Converter<String, T> getConverter(Class<T> targetType) {
        return new Converter<String, T>() {
            @Override
            public T convert(String code) {
                T[] enumConstants = targetType.getEnumConstants();
                for (T enumConstant : enumConstants){
                    if (enumConstant.getCode().equals(Integer.valueOf(code))){
                        return enumConstant;
                    }
                }
                throw new IllegalArgumentException("code" + code + "非法");
            }
        };
    }
}
