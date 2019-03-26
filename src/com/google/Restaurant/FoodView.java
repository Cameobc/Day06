package com.google.Restaurant;

public class FoodView {
	
	public void listview(Food [] foods) {		
		for(int i =0; i<foods.length; i++) {
			Food food = foods[i];
			System.out.println("메뉴를 선택하세요.");
			System.out.println((i+1)+"번 메뉴 "+food.menu);
			System.out.println("가격 "+food.price);
			System.out.println("재고수량 "+food.total);

			System.out.println("=============================");
		}
		System.out.println((foods.length+1)+"번. 주문");
	}

}
