package com.javatpoint;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	@RequestMapping("/")
	public String display() {
		return "index";
	}

	@RequestMapping("/showForm")
	public String showForm(Model m) {
		m.addAttribute("emp", new Employee());
		return "showForm";
	}

	@RequestMapping("/checkInput")
	public String checkInput(@Valid @ModelAttribute("emp") Employee e, BindingResult br) {
		System.out.println(br.hasErrors() + " Error");
		if (br.hasErrors()) {
			return "showForm";
		} else {
			return "showUserinfo";
		}
	}
}
