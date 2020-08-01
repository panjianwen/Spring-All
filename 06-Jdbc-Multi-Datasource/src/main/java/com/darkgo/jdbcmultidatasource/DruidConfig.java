package com.darkgo.jdbcmultidatasource;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;


/**
 * @ClassName DruidConfig
 * @Description: TODO
 * @Author pan
 * @Date 2020/7/31
 * @Version V1.0
 **/
@Configuration
public class DruidConfig {
    @Primary
    @Bean(name = "masterDatasource")
    @ConfigurationProperties("spring.datasource.druid.master")
    public DataSource dataSourceOne(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "clusterDatasource")
    @ConfigurationProperties("spring.datasource.druid.cluster")
    public DataSource dataSourceTwo(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "masterJdbcTemplate")
    public JdbcTemplate primaryJdbcTemplate(
            @Qualifier("masterDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }

    @Bean(name = "clusterJdbcTemplate")
    public JdbcTemplate secondaryJdbcTemplate(
            @Qualifier("clusterDatasource") DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }
}
