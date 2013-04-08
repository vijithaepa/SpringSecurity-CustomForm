package com.security.sample.controler;

import java.security.Principal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * @author vijitha Epa
 * @since 08-04-13.
 * 
 * Simple Controller class to handle incoming requests.
 */
@Controller
public class LoginController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal) {

		String userName = principal.getName();
		model.addAttribute("username", userName);
		model.addAttribute("message",
				"Spring Security with Custom Login Form Authentication");
		return "hello";

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(ModelMap map) {
		return "login";
	}

	@RequestMapping(value = "/loginfailed", method = RequestMethod.GET)
	public String loginError(ModelMap map) {

		map.addAttribute("error", true);
		return "login";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(ModelMap map) {

		return "login";
	}

}
