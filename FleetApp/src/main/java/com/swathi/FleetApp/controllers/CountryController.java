package com.swathi.FleetApp.controllers;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.swathi.FleetApp.models.Country;
import com.swathi.FleetApp.services.CountryService;

@Controller
public class CountryController { 
	
	@Autowired
	private CountryService countryService;
	
	
	@GetMapping("/country")
	public String getCountries(Model model){ 
		
		List<Country> countryList = countryService.getCountries(); 
		System.out.println(countryList);
		model.addAttribute("country",countryList);
		return "Country";	
		
	} 
	@PostMapping("/country/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/country";
	}
	
	@GetMapping("/country/findById")
	public ResponseEntity<?> findById(@RequestParam("id") int id) {
		return ResponseEntity.ok(countryService.findById(id));
		
	}
	
	
}
