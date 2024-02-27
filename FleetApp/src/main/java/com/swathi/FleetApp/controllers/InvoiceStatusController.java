package com.swathi.FleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController { 
	
	@GetMapping("/InvoiceStatus")
	public String getInvoiceStatus(){ 
		return "InvoiceStatus";
		
	}

}
