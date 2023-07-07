package com.iu.seeun5.s2;

public class Customer {

	private int money; //손님이 가지고 있는 돈
	private int point; //손님의 누적 포인트
	
	public Customer() {
		this.money=10000000;
		this.point=50;
	}
	
	public void buy(Product product) {
		this.money = this.money - product.getPrice();
		this.point = this.point + product.getPoint();
		System.out.println(this.money);
		System.out.println(this.point);
		
	}
	
	public void buy(Product[] products) {
		
		for(int i=0; i<products.length; i++) {
			this.buy(products[i]);
		}	
	}
	
}
