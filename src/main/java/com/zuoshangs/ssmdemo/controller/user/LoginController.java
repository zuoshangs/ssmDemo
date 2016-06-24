package com.zuoshangs.ssmdemo.controller.user;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping({"login",""})
	public String login(HttpServletRequest request,Model model){
		return "login";
	}
	@RequestMapping("loginDo")
	public String loginDo(String userName,String password,Model model){
		if("admin".equals(userName)){
			return "redirect:/index";
		}
		return "login";
	}
	@RequestMapping("index")
	public String index(HttpServletRequest request,Model model){
		return "index";
	}
}
