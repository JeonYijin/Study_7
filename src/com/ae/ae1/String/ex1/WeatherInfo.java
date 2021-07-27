package com.ae.ae1.String.ex1;

import java.util.Scanner;

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
	
	//searchWeather
	//도시명 입력받아서 전체정보에서 일치하는 도시를 찾아서 DTO 리턴해주기
	
	public WeatherDTO searchWeather(WeatherDTO [] weathers) {
		
		Scanner sc = new Scanner(System.in);
		String city = "seoul";
		System.out.println("도시를 입력하세요>>");
		city = sc.next();
		WeatherDTO weatherDTO = null;
		boolean check = false;
		
		//city == DTO[]의 도시와 같은지
		for(int i=0; i<weathers.length; i++) {
			//System.out.println(weathers[i].getCity());
			if(city.equals(weathers[i].getCity())) {//weathers[i].getCity().equals(city)
				weatherDTO = weathers[i];
//				System.out.println("도시명 \t 기온 \t 습도 \t 날씨");
//				System.out.println("--------------------------------");
//				//System.out.println("도시같음");
//				System.out.print(weathers[i].getCity()+"\t");
//				System.out.print(weathers[i].getGion()+"\t");
//				System.out.print(weathers[i].getHum()+"\t");
//				System.out.println(weathers[i].getCondition());
//				System.out.println("--------------------------------");
//				check = true;
				break;
			}
		}//System.out.println("없는 도시");
		
//		if(check ==false) {
//			
//			System.out.println("없는 도시");
//		}
		
		return weatherDTO;
	}
	
	
	
	public WeatherDTO[] makeWeather() {
		//split trim
		//System.out.println(sb);
		info = sb.toString();			//StringBuffer에 있는 Data를 String으로 변환
		//System.out.println(info);
		
		//파싱(parsing, 문자열을 자르는 작업)
		String [] strings = info.split(",");
		WeatherDTO[] weathers = new WeatherDTO[strings.length/4];
		
		
		for(int i=0; i<strings.length; i++) { //strings.length로 돌리면 i를 4로 나누어줘야함
			WeatherDTO weatherDTO = new WeatherDTO();
			weatherDTO.setCity(strings[i].trim());
			weatherDTO.setGion(strings[++i].trim());
			weatherDTO.setHum(strings[++i].trim());
			weatherDTO.setCondition(strings[++i].trim());
			weathers[i/4] = weatherDTO;
		}
		
	

		
		return weathers;
	}
	
}
