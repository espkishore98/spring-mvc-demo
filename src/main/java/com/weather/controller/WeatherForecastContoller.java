package com.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.weather.domain.TestModel;
import com.weather.service.IWeatherForecastService;

@RestController
public class WeatherForecastContoller {
	
	@Autowired
	IWeatherForecastService weatherForecastService;
	
	
	@PostMapping("/weatherForecast")
	public ModelAndView weatherForecast(@RequestParam("city") String cityName) {
		String response=weatherForecastService.weatherforecast(cityName);
		return new ModelAndView("result","response",response);
	}
	
//	@RequestMapping("home")
//	public ModelAndView home(TestModel test) {
//		ModelAndView model = new ModelAndView();
//		model.addObject("obj", test);
//		model.setViewName("home");
//		return model;
//			
//	}


}