package tanuj.weather.controller;
import  tanuj.weather.httpRequest.OpenWeatherMapConnection;
import tanuj.weather.json.*;
import tanuj.weather.api.WeatherRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

import tanuj.weather.api.Weather;

@Controller
public class WeatherController {
	@Autowired
	private  WeatherRepository wr;
	
	
	@GetMapping("/weatherReport")
	public String getWeatherForm(@ModelAttribute("weather") Weather weather) {
		System.out.println("function");
		return "weatherForm";
		
	}
	
	@GetMapping("/weatherReport/fetch")
	@ResponseBody
	public String getWeatherData(Weather weather) {
		String city=weather.getCity();
        OpenWeatherMapConnection.setCity(city);
        String weatherData=OpenWeatherMapConnection.sendGET();
        System.out.println("WEATHER"+weatherData);
        if(!(weatherData.equalsIgnoreCase("") ||weatherData.equalsIgnoreCase(null)) )
        wr.save(JsonConversion.getjsonMsg(weatherData));
		
		return weatherData;
	}
	
	

	public WeatherController() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	
	
}
