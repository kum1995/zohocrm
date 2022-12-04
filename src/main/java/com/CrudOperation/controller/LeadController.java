package com.CrudOperation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.CrudOperation.entities.Lead;
import com.CrudOperation.repositiory.LeadRepositiory;

@Controller
public class LeadController {
	
	@Autowired
	LeadRepositiory leadrepo;
	
	@RequestMapping("/create")
	public String ViewPage() {
		
		return"create_page";
	}
	@RequestMapping("/save")
	public String saveOnelead(@ModelAttribute("lead") Lead lead ,Model map) {
		leadrepo.save(lead);
		map.addAttribute("msg", "save Record");
		return"create_page";	
	}

}
