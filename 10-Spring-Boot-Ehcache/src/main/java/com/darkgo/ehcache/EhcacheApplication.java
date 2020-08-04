package com.darkgo.ehcache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 清空缓存的策略
 *
 * FIFO 先进先出
 *
 * LFU 最少使用
 *
 * LRU 最近最少使用
 */

@SpringBootApplication
public class EhcacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(EhcacheApplication.class, args);
    }

}
