package com.kindsonthegenius.fleetapp.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kindsonthegenius.fleetapp.models.*;
import com.kindsonthegenius.fleetapp.services.CountryService;



@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public String getCountries(Model model) {
		
		List <Country> countryList =countryService.getCountries();
		model.addAttribute("countries",countryList);
		
		return "Country";
	}
	
	@PostMapping("/countries/addNew")
	public String addNew(Country country) {
		countryService.save(country);
		return "redirect:/countries";
	}
	
	//after getting this Id we don't want it to return a JSON
	//or redirect to a page that will display a JSON so only return it and capture it 
	@RequestMapping("/countries/findById") 
	@ResponseBody
	public Optional<Country> findById(int id) {
		return countryService.findById(id);
		 
	}
}
