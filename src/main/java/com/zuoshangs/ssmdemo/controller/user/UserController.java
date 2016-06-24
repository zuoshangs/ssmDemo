package com.zuoshangs.ssmdemo.controller.user;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zuoshangs.ssmdemo.pojo.user.Favorite;
import com.zuoshangs.ssmdemo.pojo.user.User;
import com.zuoshangs.ssmdemo.service.user.IFavoriteService;
import com.zuoshangs.ssmdemo.service.user.IUserService;

@Controller
@RequestMapping("/users")
public class UserController {
	@Resource
	private IUserService userService;
	@Resource
	private IFavoriteService favoriteService;
	
	@RequestMapping("/showUser")
	public String showUser(HttpServletRequest request,Model model){
		int userId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(userId);
		List<Favorite> favorites = favoriteService.selectAll();
		model.addAttribute("user", user);
		model.addAttribute("favoriteList", favorites);
		String fs = user.getFavorite();
		Map<String,Boolean> myFavoriteMap = new HashMap<String,Boolean>();
		if(StringUtils.isNotBlank(fs)){
			String[] arrs = fs.split(",");
			List<Favorite> myFavorites = favoriteService.selectByCodes(Arrays.asList(arrs));
			for (int i = 0; i < myFavorites.size(); i++) {
				myFavoriteMap.put(myFavorites.get(i).getCode(), true);
			}
		}
		
		model.addAttribute("myFavoriteMap", myFavoriteMap);
		return "userForms";
	}
	@RequestMapping({"userList",""})
	public String index(HttpServletRequest request,Model model){
		List<User> list = this.userService.selectAll();
		model.addAttribute("list", list);
		return "userList";
	}
	@RequestMapping("saveUser")
	public String saveUser(User user,HttpServletRequest request,Model model){
		userService.update(user);
		return "redirect:/users/userList";
	}
	
}
