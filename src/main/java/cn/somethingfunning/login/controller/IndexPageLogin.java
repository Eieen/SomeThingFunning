package cn.somethingfunning.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexPageLogin {
	@RequestMapping("login.shtml")
	public String login(){
		System.out.println("entry controller!------------------------------->");
		return "index.html";
	}
}
