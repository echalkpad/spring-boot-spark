package com.spark.example.config;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by bangnl on 1/4/16.
 */
@ConfigurationProperties(prefix = "com.spark.example.spark")
@Configuration
public class SparkConfig {
    private String appName;
    private String master;

    @Bean
    public JavaSparkContext initSparkContext(){
        SparkConf sparkConf =  new SparkConf().setAppName(appName).setMaster(master);
        JavaSparkContext context = new JavaSparkContext(sparkConf);
        return  context;
    }
}
