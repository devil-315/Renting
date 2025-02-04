package com.devil.renting.common.sms;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClassName：AliyunSMSProperties
 *
 * @author: Devil
 * @Date: 2025/2/3
 * @Description:
 * @version: 1.0
 */
@Data
@ConfigurationProperties(prefix = "aliyun.sms")
public class AliyunSMSProperties {

    private String accessKeyId;

    private String accessKeySecret;

    private String endpoint;
}
