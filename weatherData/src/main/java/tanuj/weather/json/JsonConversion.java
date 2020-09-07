package tanuj.weather.json;

import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import tanuj.weather.api.ForcastData;

public class JsonConversion {
	private static ForcastData fcastData=new ForcastData();
	public static ForcastData getjsonMsg(String msgJson) {
		
		Object obj=JSONValue.parse(msgJson);
		JSONObject jsonObject = (JSONObject) obj;  
		Map coord=(Map) jsonObject.get("coord");
		fcastData.setLon(coord.get("lon").toString());
		fcastData.setLat(coord.get("lat").toString());
		fcastData.setBase(jsonObject.get("base").toString());
		Map main=(Map) jsonObject.get("main");
		fcastData.setTemp(main.get("temp").toString());
		fcastData.setFeels_like(main.get("feels_like").toString());
		fcastData.setTemp(main.get("temp_min").toString());
		fcastData.setTemp_max(main.get("temp_max").toString());
		fcastData.setPressure(main.get("pressure").toString());
		fcastData.setHumidity(main.get("humidity").toString());
		fcastData.setVisibility(jsonObject.get("visibility").toString());
		Map wind=(Map) jsonObject.get("wind");
		fcastData.setSpeed(wind.get("speed").toString());
		fcastData.setDeg(wind.get("deg").toString());
	
		fcastData.setDt(jsonObject.get("dt").toString());
		Map sys=(Map) jsonObject.get("sys");
		fcastData.setCountry(sys.get("country").toString());
		fcastData.setSunrise(sys.get("sunrise").toString());
		fcastData.setSunset(sys.get("sunset").toString());
		fcastData.setName(jsonObject.get("name").toString());
		fcastData.setId_sys(jsonObject.get("id").toString());
		fcastData.setCod(jsonObject.get("cod").toString());
		fcastData.setTimezone(jsonObject.get("timezone").toString());
		return fcastData;
		
	}
	
}
