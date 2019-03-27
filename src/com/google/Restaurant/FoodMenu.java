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
				view.listview(foods);
				

			}
		}//while1
	}

}
