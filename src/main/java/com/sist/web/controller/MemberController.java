package com.sist.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/member/")
public class MemberController {
	
	@GetMapping("login")
	public String member_login(Model model) {
		model.addAttribute("main_jsp", "../member/login.jsp");
		return "main/main";
	}
	
	@GetMapping("login_ok")
	public String member_login_ok(HttpSession session) {
		session.setAttribute("id", "admin");
		return "redirect:/main";
	}

	@GetMapping("logout")
	public String member_logout(HttpSession session) {
		session.invalidate();
		return "redirect:/main";
	}

}
