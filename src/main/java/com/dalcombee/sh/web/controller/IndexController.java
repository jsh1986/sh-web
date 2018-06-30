package com.dalcombee.sh.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("")
@RestController
public class IndexController {
	
	@RequestMapping("")
	public String index() {
		// TODO : 추후 화면과 연결해야됨
		return "달콤비 홈페이지 입니다. 반갑습니다.^^;  This is dalcombee website. Nice to meet you.";
	}
}
