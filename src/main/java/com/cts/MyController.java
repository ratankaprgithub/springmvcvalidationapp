package com.cts;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	

	
	@RequestMapping("/")
	public String sayHello(Model m){
	
		StudentBean st=new StudentBean();
	
		//String deafuleCourses[]={"Java","Spring"};
		//st.setCourses(deafuleCourses);
		
		m.addAttribute("student", st);
		
		return "home";
	}
	
	
	@RequestMapping(value="/addstudent")
	public String registerStudent(@Valid @ModelAttribute("student")StudentBean student,BindingResult br,Model m){
		
		
		if(br.hasErrors()){
			
			return "home";
			
			
		}
		
		m.addAttribute("student", student);
		
		return "sucess";
		
		
	}
	
	

	
	
	
	
	
	
	
	
	
	

}
