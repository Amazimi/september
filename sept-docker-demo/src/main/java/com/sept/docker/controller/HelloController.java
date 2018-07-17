package com.sept.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 一句话描述
 *
 * @author johnny
 * @date 2018/7/16
 * @since JDK 1.8
 */
@RestController
public class HelloController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "hello docker";
	}

}
