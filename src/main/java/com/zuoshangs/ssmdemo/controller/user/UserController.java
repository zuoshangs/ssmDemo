package com.zuoshangs.ssmdemo.controller.user;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zuoshangs.ssmdemo.pojo.user.User;
import com.zuoshangs.ssmdemo.service.user.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private IUserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "showUser";
	}
	@RequestMapping("")
	public String index(HttpServletRequest request,Model model){
		List<User> list = this.userService.selectAll();
		model.addAttribute("list", list);
		return "showUserList";
	}
}
