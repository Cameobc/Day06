package com.google.Restaurant;

import java.util.Scanner;

public class FoodMenu {
	public void start() {
		Scanner sc = new Scanner(System.in);
		FoodInput fi = new FoodInput();
		Food [] foods = null;	
		FoodView view = new FoodView();
		boolean check=true;
		
		foods = fi.makeFood();
		while(check) {
			System.out.println("1.주 문");
			System.out.println("2.결 산");
			int select = sc.nextInt();

			if(select == 1) {
				while(check) {
					int num =0;
					Food [] count = new Food[num];
					for(int i =0; i<foods.length; i++) {
						Food food = foods[i];
						System.out.println((i+1)+"번 메뉴 "+food.menu);
						System.out.println("가격 "+food.price);
						System.out.println("재고수량 "+food.total);
						System.out.println("=============================");
					}//for end
					System.out.println((foods.length+1)+"번. 주문");
					System.out.println("메뉴를 선택하세요.");
					select = sc.nextInt();			
					System.out.println("수랑을 입력하세요.");
					 = sc.nextInt();			
					count[num];
					if(select!=(foods.length+1)) {
						
					}
				}
	
				}
		}//while
	}

}
