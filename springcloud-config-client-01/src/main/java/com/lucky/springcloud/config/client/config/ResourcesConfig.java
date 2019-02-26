package com.lucky.springcloud.config.client.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;

/**
 * 属性配置(@RefreshScope添加到这里不起作用，一定要添加到控制器这里)
 *
 * @author Waldron Ye
 * @date 2019/2/26 22:59
 */
@Configuration
@RefreshScope
public class ResourcesConfig {

    public static String NOTIFY_URL;

    @Value("${pay.notify.url}")
    public void setNotifyUrl(String notifyUrl) {
        NOTIFY_URL = notifyUrl;
    }
}
