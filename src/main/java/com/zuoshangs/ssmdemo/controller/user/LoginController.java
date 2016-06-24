package com.zuoshangs.ssmdemo.controller.user;

import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.web.util.WebUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.zuoshangs.ssmdemo.sys.realm.FormAuthenticationFilter;

@Controller
@RequestMapping("/")
public class LoginController {
	@RequestMapping(value={"login",""},method=RequestMethod.GET)
	public String login(HttpServletRequest request,Model model){
		return "login";
	}
	/**
	 * 登录失败，真正的登录成功有shiro控制
	 * @param userName
	 * @param password
	 * @param model
	 * @return
	 */
	@RequestMapping(value={"login"},method=RequestMethod.POST)
	public String loginDo(HttpServletRequest request,Model model){
		//String username = WebUtils.getCleanParam(request, FormAuthenticationFilter.DEFAULT_USERNAME_PARAM);
		//String exception = (String)request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
		String message = (String)request.getAttribute(FormAuthenticationFilter.DEFAULT_MESSAGE_PARAM);
		model.addAttribute("message", message);
		return "login";
	}
	/**
	 * 登录成功，首页
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String index(HttpServletRequest request,Model model){
		return "index";
	}
}
