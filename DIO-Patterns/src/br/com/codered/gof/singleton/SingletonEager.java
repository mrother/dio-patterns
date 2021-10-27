package br.com.codered.gof.singleton;


public class SingletonEager {

	private static SingletonEager instance = new SingletonEager();
	
	private SingletonEager() {
		super();
		
	}
	
	public static SingletonEager getInstance() {
		return instance;
	}
}
