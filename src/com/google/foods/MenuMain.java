package com.google.foods;

public class MenuMain {
	
	public void orderView() {
		System.out.println("영수증 출력");
	}
	
	public static void main(String[] args) {
		MenuController mc = new MenuController();
		mc.start();
	}

}
