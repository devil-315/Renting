package com.devil.renting.common.utils;

import java.util.Random;

/**
 * ClassName：CodeUtil
 *
 * @author: Devil
 * @Date: 2025/2/3
 * @Description:
 * @version: 1.0
 */
public class CodeUtil {
    public static String getRandomCode(Integer length){
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0;i < length;i++){
            int num = random.nextInt(10);
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }
}
