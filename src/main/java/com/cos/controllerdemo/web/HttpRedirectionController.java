package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpRedirectionController {
	
	@GetMapping("/home")
	public String home() {
		// 1만줄이 있다고 가정
		return "home";
	}
	
	@GetMapping("/away")
	public String away() {
		// 다른코드
		// 1만줄이 있다고 가정
		return "redirect:/home";		// 리다이렉션이 된다. (@Controller일때만 발동, @RestController일때는 발동안함)
	}

}
