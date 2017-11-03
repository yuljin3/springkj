package com.kji.study.observable.custom;

import java.util.ArrayList;

import lombok.Getter;

public class WeatherData implements Observable {

	private ArrayList<Observer> observers;
	
	@Getter
	private float temperature; 
	@Getter
	private float humidity;
	@Getter
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer observser) {
		observers.add(observser);
	}

	@Override
	public void deleteObserver(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		Object obj = new Object();
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
	
	// 새로운 데이터를 전달 받아 갱신하고 새로운 데이터가 들어왔음을 알린다.
	// 기상스테이션(WeatherStation)에서는 주기적으로 이 함수를 사용해 최신 데이터를 전달한다.
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}

	// 갱신할 새로운 데이터 여부의 플래그 값을 변경하고(setChanged())
	// 옵저버들에게 새로운 데이터를 전달한다. (notifyObservers())
	public void measurementsChanged() {
		notifyObservers();
	}

	
}
