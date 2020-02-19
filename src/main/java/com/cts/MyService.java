package com.cts;

import org.springframework.stereotype.Service;

@Service
public class MyService {
	
	public String getMsg(String name){
		return "Welcome  "+name;
	}

}
