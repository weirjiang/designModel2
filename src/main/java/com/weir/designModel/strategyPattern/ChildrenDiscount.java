package com.weir.designModel.strategyPattern;

public class ChildrenDiscount implements Discount {

	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("儿童票：");
		return price - 10;

	}

}
