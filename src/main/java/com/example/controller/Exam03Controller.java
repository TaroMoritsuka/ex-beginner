package com.example.controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam03")
public class Exam03Controller {
	
	@Autowired
	private ServletContext application;
	
	@RequestMapping("")
	public String index() {
		return "exam03";
	}
	
	@RequestMapping("/input")
	public String input(Integer price1, Integer price2, Integer price3) {
		Integer total = price1 + price2 + price3;
		Integer totalIncludingTax = (int) (total * 1.08);
		application.setAttribute("total", total);
		application.setAttribute("totalIncludingTax", totalIncludingTax);
		return "exam03-result";
	}
}
