package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.FeedbackDao;
import com.entity.Feedback;

@Controller
public class IndexController 
{
	@Autowired
	private FeedbackDao fdao;
	
	Feedback feedback;
	
	/*public void setFdao(FeedbackDao fdao) {
		this.fdao = fdao;
	}*/

	@RequestMapping("/")
	public String home()
	{
		return "index.jsp";
	}
	
	@RequestMapping("feedback.htm")
	public String feedback()
	{
		return "feedback.jsp";
	}
	
	@RequestMapping("/addFeedback")
	//public String addFeedback(@RequestParam("name")String name, @RequestParam("email") String email, @RequestParam("reg") String reg, @RequestParam("code") String code,@RequestParam("msg") String msg, @RequestParam("rating") int rating)
	public String addFeedback(@ModelAttribute("feedback") Feedback feedback)
	{
		//feedback = new Feedback(name, email, reg, code, rating);
		System.out.println(feedback);
		fdao.addFeedback(feedback);
		
		return "welcome.jsp";
	}
}
