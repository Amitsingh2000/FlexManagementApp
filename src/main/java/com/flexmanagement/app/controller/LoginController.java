package com.flexmanagement.app.controller;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

@Controller
public class LoginController 
{
	
	@GetMapping(value="/Dashboard")
	@PreAuthorize("hasAnyAuthority('ADMIN', 'USER')")
	public String dash(ModelMap m) 
	{ 
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
		HttpSession session = request.getSession();
		Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
		String role = authorities.iterator().next().getAuthority();
		//m.addAttribute("userRole",role);
		session.setAttribute("userRole", role);
		return "Dashboard"; 
	}
	@GetMapping(value="/Index")
	public String home()
	{
		return "index";
	}
	 @GetMapping("/logout")
	    public String logout(HttpServletRequest request, HttpServletResponse response) {
	        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	        if (authentication != null) {
	            new SecurityContextLogoutHandler().logout(request, response, authentication);
	        }
	        return "redirect:/login?logout";
	    }
}
