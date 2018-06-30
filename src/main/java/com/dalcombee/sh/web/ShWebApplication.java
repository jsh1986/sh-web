package com.dalcombee.sh.web;

import java.util.Arrays;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
@EnableAutoConfiguration
public class ShWebApplication {

	public static void main(String[] args) {
		log.info("ShWebApplication Start");
		log.info("args : {}", Arrays.asList(args));

		SpringApplication app = new SpringApplication(ShWebApplication.class);
		app.setBannerMode(Banner.Mode.LOG);
		app.run(args);
	}
}
