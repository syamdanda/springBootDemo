package com.demo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.modal.Message;


@RestController
@RequestMapping("/msg")
public class MessageController {
	
	List<Message> messages = new ArrayList<Message>();
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcomeMsg(HttpServletRequest httpServletRequest) {
		return "Hello World..!";
		
	}
	
	@RequestMapping(value="/sendMsg", method=RequestMethod.POST)
	public  void sendMsg(@RequestBody Message msg, HttpServletRequest httpServletRequest) {
		messages.add(msg);
		System.out.println(msg.getMessage());		
	}
	
	@RequestMapping(value="/getAllMsgs", method=RequestMethod.GET)
	public  List<Message> getAllMsgs(HttpServletRequest httpServletRequest) {
		return messages;
	}

}
