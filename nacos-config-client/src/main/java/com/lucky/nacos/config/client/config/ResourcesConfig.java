package com.lucky.nacos.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 暂时不能更新值
 *
 * @author Waldron Ye
 * @date 2019/2/27 22:06
 */
@Configuration
@RefreshScope
public class ResourcesConfig {

    /**
     * 系统前缀
     */
    public static String SYSTEM_PREFIX;


    @Value("${luck.config.system-prefix:epay-test}")
    public void setSystemPrefix(String systemPrefix) {
        SYSTEM_PREFIX = systemPrefix;
    }
}
