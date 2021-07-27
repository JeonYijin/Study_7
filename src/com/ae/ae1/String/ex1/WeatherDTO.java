package com.ae.ae1.String.ex1;

public class WeatherDTO { //데이터를 담는 클래스는 여러 번 사용 됨
	
	private String city;
	private String gion;
	private String hum; //습도
	private String condition;
	
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getGion() {
		return gion;
	}
	public void setGion(String gion) {
		this.gion = gion;
	}
	public String getHum() {
		return hum;
	}
	public void setHum(String hum) {
		this.hum = hum;
	}
	public String getCondition() {
		return condition;
	}
	public void setCondition(String condition) {
		this.condition = condition;
	}
	

}
