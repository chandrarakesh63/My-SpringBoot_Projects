package com.motivity.BankMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BankController {
	
		@RequestMapping("/bank")
		public String bank()
		{
			
			return "bank";
		}


}
