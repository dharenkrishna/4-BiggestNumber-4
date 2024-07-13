package com.dharen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BiggestNumberController {
	@RequestMapping("/")
	public String numberForm() {
		return "number";
	}
	@RequestMapping("/submit")
	public String biggestNumber(@RequestParam int first, @RequestParam int second, @RequestParam int third, ModelMap model) {
		model.put("firstn",first);
		model.put("secondn", second);
		model.put("thirdn", third);
		int biggest;
		if(first > second) {
			if(first > third) 
				biggest = first;
			else
				biggest = third;
		}
		else {
			if(second > third)
				biggest = second;
			else
				biggest = third;
		}
		model.put("biggest", biggest);
		return "result";
	}

}
