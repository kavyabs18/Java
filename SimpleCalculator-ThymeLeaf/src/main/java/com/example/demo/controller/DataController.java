package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {
	@GetMapping ("/sum")
	public String sum(@RequestParam Integer data1,Integer data2) {
		return "Sum = "+(data1+data2); 
	}
	@GetMapping ("/diff")
	public String diff(@RequestParam Integer data1,Integer data2) {
		return "Difference = "+(data1-data2); 
	}
	@GetMapping ("/prod")
	public String prod(@RequestParam Integer data1,Integer data2) {
		return "product = "+(data1*data2); 
	}
	@GetMapping ("/quo")
	public String quo(@RequestParam Integer data1,Integer data2) {
		return "Quotient = "+(data1/data2); 
	}
	@GetMapping ("/rem")
	public String rem(@RequestParam Integer data1,Integer data2) {
		return "Remainder = "+(data1%data2); 
	}
}
