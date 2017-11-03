package com.kji.study.observable.jdk;

public class WeatherStation {

	static WeatherData weatherData = new WeatherData();
	
	public static void changeWeather(float temp, float humity, float pressure) {
		weatherData.setMeasurements(temp, humity, pressure);
	}
	
	public static void setUp() {
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
	}

	public static void main(String[] args) {

		 setUp();
		
		System.out.println("-----날씨가 변한다.----");
		changeWeather(40, 50, 10);

		System.out.println("");

		System.out.println("-----날씨가 변한다.----");
		changeWeather(50, 60, 20);

		System.out.println("");

	}
}
