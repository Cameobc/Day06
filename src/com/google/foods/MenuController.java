package com.google.foods;

import java.util.Scanner;

public class MenuController {

	public void start() {
		//1메뉴등록
		MenuAdd menuAdd = new MenuAdd();
		boolean check = true;
		Scanner sc = new Scanner(System.in);
		MenuView menuCount = new MenuView();

		Food [] foods = menuAdd.add();
		int [] counts = new int[foods.length];

		while(check) {
			System.out.println("1.주문");
			System.out.println("2.결산");
			int select=sc.nextInt();

			if(select==1) {
				while(check) {
					for(int i =0; i<foods.length; i++) {
						System.out.println(i+1 +" . "+foods[i].name +" : "+ foods[i].price);
					}
					System.out.println(foods.length+1 +".주문하기");
					select = sc.nextInt();
					if(select<=foods.length) {
					System.out.println("수량을 입력");
					counts[select-1] = sc.nextInt();  //select-1 인덱스번호라서. select 2 면 인덱스번호는 1번에 저장되기 때문임.
					}else {
						//영수증 출력
						menuCount.orderView(foods, counts);
						break;  //check=!check로 하면 거짓이 돼서 바깥 와일문도 안 돌아가서 브레이크만 써야함.
					}
				}
			}else {
				menuCount.count(foods);
				check=!check;
			}
		}

	}

}
