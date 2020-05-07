package com.example.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

/**
 * @Author: Simon.Wang
 * @Date: 2019/11/15 9:55
 * @Describe:
 */
public class DataSourceConfig {

    @Bean
    @Qualifier("primaryDataSource")
    @ConfigurationProperties(prefix = "primaryDataSource")
    public DataSource primaryDataSource() {
        return DataSourceBuilder.create().build();
    }


}