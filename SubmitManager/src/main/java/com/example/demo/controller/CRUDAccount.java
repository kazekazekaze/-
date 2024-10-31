package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.cons.Const;
import com.example.demo.model.Account;
import com.example.demo.repositorie.AccountRepository;

@Controller
public class CRUDAccount {
	
	@Autowired
	AccountRepository account_repository;
	
	@PostMapping("/create_user_account")
	public String create_user_account(
			@RequestParam("Id") int id,
			@RequestParam("Name") String name,
			@RequestParam("Password") String pass,
			@RequestParam("Authority") int authority
			) {
		Account account = new Account();
		account.SetId(id);
		account.SetName(name);
		account.SetPassword(pass);
		account.SetAuthority(authority);
		account_repository.save(account);
		
		return "redirect:/";
	}
	
	@PostMapping("/delete_user_account")
	public String delete_user_account(@RequestParam("Id") Integer id) {
		account_repository.deleteById(id);
		return "redirect:/";
	}
	
	@PostMapping("/update_user_account")
	public ModelAndView update_user_account(@RequestParam("Id") Integer id, ModelAndView mav) {
		Account account = account_repository.findById(id).get();
		mav.setViewName("account_config");
		mav.addObject("title", "アカウント編集");
		if(account != null) {
			mav.addObject("account", account);
		}
		return mav;
	}
}
