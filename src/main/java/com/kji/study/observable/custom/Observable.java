package com.kji.study.observable.custom;

public interface Observable {

	public abstract void addObserver(Observer observser);
	public abstract void deleteObserver(Observer observer);
	public abstract void notifyObservers();
	
}
