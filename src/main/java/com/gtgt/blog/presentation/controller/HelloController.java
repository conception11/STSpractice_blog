package com.gtgt.blog.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String index(Model model) {
		model.addAttribute("name", "SpringBlog from GT");
		model.addAttribute("age", "I'm 24 years old");
		model.addAttribute("id", "HackSniper");
		
		model.addAttribute("className", this.getClass());
		
		return "hello";
	}	
}
