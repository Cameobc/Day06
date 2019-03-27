package com.google.Restaurant;

import java.util.Scanner;

public class FoodView {

	public void listview(Food [] foods) {			
		boolean check= true;
		Scanner sc = new Scanner(System.in);	

		while(check) {
			int select =0;
			int num =0;
			Food [] count = new Food[num];
			for(int i =0; i<foods.length; i++) {
				Food food = foods[i];
				System.out.println((i+1)+"번 메뉴 "+food.menu);
				System.out.println("가격 "+food.price);
				System.out.println("재고수량 "+food.total);
				System.out.println("=============================");
			}
			System.out.println((foods.length+1)+"번. 주문");
			System.out.println("메뉴를 선택하세요.");
			select = sc.nextInt();			
			System.out.println("수랑을 입력하세요.");
			num = sc.nextInt();
			if(select==(foods.length+1)) { 
				break;
			}
		}//while
		for(int i =0; i<foods.length; i++) {
			Food food = foods[i];
			System.out.println(food.menu);
			System.out.println(food.price);
			System.out.println(food.total);
			System.out.println(food.count);
			System.out.println("=============================");

		}	

	}

}
