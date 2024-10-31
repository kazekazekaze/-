package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Account;
import com.example.demo.model.Classroom;
import com.example.demo.repositorie.AccountRepository;
import com.example.demo.repositorie.ClassroomRepository;

@Controller
public class CRUDClassroom {
	@Autowired
	ClassroomRepository classroom_repository;
	@Autowired
	AccountRepository account_repository;
	
	@PostMapping("/confilm_classroom")
	public ModelAndView confilm_classroom(@RequestParam("ClassroomId") String ClassroomId, ModelAndView mav) {
		List<Classroom> list = classroom_repository.findAll();
		list = list.stream().filter(x -> x.GetClassname().equals(ClassroomId)).toList();//何とかして取得しよう
		list.forEach(System.out::println);
		mav.setViewName("classroom_config");
		mav.addObject("title", "クラスメイト一覧");
		if(list != null) {
			mav.addObject("list", list);
			
			List<Account> ac_list = new ArrayList<>();
			for(Classroom c : list) {
				Account a = account_repository.findById(c.GetAccountId()).get();
				System.out.println(a);
				ac_list.add(a);
			}
			mav.addObject("account_list", ac_list);
		}
		return mav;
		
	}
}
