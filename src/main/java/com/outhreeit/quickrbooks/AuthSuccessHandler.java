package com.outhreeit.quickrbooks;

import java.io.IOException;
import java.security.Principal;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.transaction.annotation.Transactional;

import com.outhreeit.quickrbooks.daos.UserDao;
import com.outhreeit.quickrbooks.entities.User;
import com.outhreeit.quickrbooks.services.UserService;
import com.outhreeit.quickrbooks.webcontroller.UserWebController;


public class AuthSuccessHandler implements AuthenticationSuccessHandler {

	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	
	private UserService userService; 
	
	@Autowired
	public AuthSuccessHandler(UserService service){
		this.userService = service;
	}

	public AuthSuccessHandler(){}
	
	
	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		System.out.println("user = " + SecurityContextHolder.getContext().getAuthentication().getPrincipal());
		String authUser = ((UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
		System.out.println("user = " + authUser);
		/*boolean inDatabase = userService.doesNameExist(authUser);
		if(!inDatabase){
			User user = new User(authUser);
			userService.add(user);
		}*/
		redirectStrategy.sendRedirect(request,  response,  "/loginsuccess");
	}
	
	
}
