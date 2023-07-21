package com.tcs.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {
	@GetMapping("/admin")
	public String admin() {
		return " Welcome to Admin";
	}
	@GetMapping("/contact")
	public String contactUs() {
		return "Thanks for Contact us +7013441335";
	}
	

}
