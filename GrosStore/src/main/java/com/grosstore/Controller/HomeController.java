package com.grosstore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
@RequestMapping("/")
public String index()
{
	return "index";
}


@RequestMapping("/login")
public String login(Model model)
{
	model.addAttribute("classActiveLogin",true);
	return "login";
}


@RequestMapping("/forgetPassword")
public String forgetPassword(Model model)
{
	model.addAttribute("classActiveForgetPassword",true);
	return "login";
}


@RequestMapping("/newUser")
public String newUser(Model model)
{
	model.addAttribute("classActiveNewUser",true);
	return "login";
}

}
