package com.weir.designModel.strategyPattern;

public class VIPDiscount implements Discount {

	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("VIP票：");
		System.out.println("增加积分！");
		return price * 0.5;

	}

}
