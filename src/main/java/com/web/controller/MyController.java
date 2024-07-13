package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/")
	public String indexPage() {
		return "index";
}
	@RequestMapping("/abouturl")
	public String aboutPage() {
		return "about";
}
	
	@RequestMapping("/contacturl")
	public String contact() {
		return "contact";
}
	@RequestMapping("/loginurl")
	public String login() {
		return "login";
}
	@RequestMapping("/result")
	public String login(@RequestParam String email,@RequestParam String psw,ModelMap model) {
		model.put("email", email);
		model.put("psw", psw);
		return "result";
	}
			
	@RequestMapping("/registerurl")
	public String register() {
		return "register";
}
}