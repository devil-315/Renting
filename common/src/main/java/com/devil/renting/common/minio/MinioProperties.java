package com.devil.renting.common.minio;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * ClassName：MinioProperties
 *
 * @author: Devil
 * @Date: 2025/1/31
 * @Description:
 * @version: 1.0
 */
@ConfigurationProperties(prefix = "minio")
@Data
public class MinioProperties {

    private String endpoint;

    private String accessKey;

    private String secretKey;

    private String bucketName;
}
