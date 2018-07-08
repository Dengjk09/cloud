package com.dengjk.clouduserprovid.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.Charset;

/**
 * @author Dengjk
 * @create 2018-04-28 13:58
 * @desc  http请求resttemplate配置
 **/
@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(){
        StringHttpMessageConverter m = new StringHttpMessageConverter(Charset.forName("UTF-8"));
        return new RestTemplateBuilder()
                .setConnectTimeout(60000)
                .setReadTimeout(60000)
                .additionalMessageConverters(m)
                .build();
    }
}
