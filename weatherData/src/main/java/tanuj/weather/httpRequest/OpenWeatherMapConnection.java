package tanuj.weather.httpRequest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class OpenWeatherMapConnection {
	private static final String USER_AGENT = "Mozilla/5.0";
	private static final String URL = "https://api.openweathermap.org/data/2.5/weather";
	private static String city;
	private static final String key="6ab6303d09d471f51d8763e96bc390ae";
	
	
	public static void setCity(String city) {
		OpenWeatherMapConnection.city = city;
	}


	


	public static String sendGET() {
		String GET_URL=URL+"?q="+city+"&appid="+key;
		System.out.println(GET_URL);
		try {
		URL obj = new URL(GET_URL);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("charset", "utf-8");
		con.setRequestProperty("Content-Type", "text/plain"); 
		con.setInstanceFollowRedirects(true);
		//con.setRequestProperty("User-Agent", USER_AGENT);
		//con.setReadTimeout(5000000);
		//con.setConnectTimeout(5000000);
		
		
		int responseCode=0;
		responseCode= con.getResponseCode();
		
		if (responseCode == HttpURLConnection.HTTP_OK) { 
			
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputData=in.readLine();
			return inputData;
			
		}
		
		}catch(IOException e) {
			e.getStackTrace();
		}
		
		return null;
	}
	


}
