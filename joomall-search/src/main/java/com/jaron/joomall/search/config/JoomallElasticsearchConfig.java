package com.jaron.joomall.search.config;

import org.elasticsearch.client.RequestOptions;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JoomallElasticsearchConfig {

    public static final RequestOptions COMMON_OPTIONS;

    static {
        RequestOptions.Builder builder = RequestOptions.DEFAULT.toBuilder();

        COMMON_OPTIONS = builder.build();
    }
}
