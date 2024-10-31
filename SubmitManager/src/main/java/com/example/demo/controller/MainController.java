package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Account;
import com.example.demo.repositorie.AccountRepository;

@Controller
public class MainController {
	@Autowired
	AccountRepository account_repository;
	
	@GetMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("form");
		mav.addObject("title", "Hello page.");
		List<Account> list = account_repository.findAll();
		mav.addObject("data", list);
		return mav;
	}
	
	@GetMapping("/create_user_account_test")
	public ModelAndView test(@ModelAttribute Account account, ModelAndView mav) {
		mav.setViewName("test");
		mav.addObject("account", account);
		return mav;
		
	}
}
