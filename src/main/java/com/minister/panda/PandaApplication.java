package com.minister.panda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Spring Boot在没有配置数据源的时候需要进行如下配置，否则启动报错
 */
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})
/**
 * 启用定时任务的配置
 */
@EnableScheduling
/**
 * 启用异步执行程序
 */
@EnableAsync
public class PandaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PandaApplication.class, args);
	}
}
