package com.kindsonthegenius.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {
	
	@GetMapping("/vehiclemake")
	public String getvehicleMake() {
		return "VehicleMake";
	}

}
