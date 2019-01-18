package com.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.modal.Message;


@RestController
@RequestMapping("/msg")
public class MessageController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcomeMsg(HttpServletRequest httpServletRequest) {
		return "Hello World..!";
		
	}
	
	@RequestMapping(value="/sendMsg", method=RequestMethod.POST)
	public  void authenticateUser(@RequestBody Message msg, HttpServletRequest httpServletRequest) {
		
		System.out.println(msg.getMessage());
		
	}

}
