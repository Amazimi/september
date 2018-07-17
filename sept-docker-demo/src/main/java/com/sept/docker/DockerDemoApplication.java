package com.sept.docker;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * DockerDemoApplication 启动类
 *
 * @author johnny
 * @date 2018/7/16
 * @since JDK 1.8
 */
@SpringBootApplication
public class DockerDemoApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(DockerDemoApplication.class).web(true).run(args);
	}
}
