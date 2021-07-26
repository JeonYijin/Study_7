package com.ae.ae1.String.ex1;

public class WeatherInfo {

	private String info;
	private StringBuffer sb; 
	
	
	public WeatherInfo() {
		sb = new StringBuffer();
		sb.append("seoul, 37, 80, 맑음,");
		sb.append("daegu, 43, 90, 지옥,");
		sb.append("busan, -32, 10, 눈,");
		sb.append("jeju, 3, 40, 비");
	}
	
	
	
	
	public WeatherDTO[] makeWeather() {
		//split trim
		//System.out.println(sb);
		info = sb.toString();
		System.out.println(info);
		
		String [] strings = info.split(",");
		WeatherDTO[] DTOs = new WeatherDTO[strings.length/4];
		
		for(int i=0; i<strings.length; i++) {
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[i]);
			weatherDTO.setGion(strings[i+1]);
			weatherDTO.setHum(strings[i+2]);
			weatherDTO.setCodition(strings[i+3]);
			i=i+3;
		}
		
		for(int i=0; i< strings.length; i++) {
			System.out.println(strings[i]);
		}
		
		
		return null;
	}
	
}
