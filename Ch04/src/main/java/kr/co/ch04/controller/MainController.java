package kr.co.ch04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// controller 어노테이션
@Controller
public class MainController {
	
	// /hello 요청하면 실행됨
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String hello() {
		return "/hello";
	}
	
	// 더 편한 방법
	@GetMapping("/welcome")
	public String welcome() {
		return "/welcome";
	}
	
	@GetMapping("/greeting")
	public String greeting() {
		return "/greeting";
	}
	
	// 리다이렉트
	@GetMapping("/redirect")
	public String redirect() {
		return "redirect:/user1/register";
	}
	
	@GetMapping("/forward")
	public String forward() {
		return "forward:/user2/register";
	}
	
}
