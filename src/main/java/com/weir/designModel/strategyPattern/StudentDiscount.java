package com.weir.designModel.strategyPattern;

public class StudentDiscount implements Discount {

	public double calculate(double price) {
		// TODO Auto-generated method stub
		System.out.println("学生票：");
		return price * 0.8;

	}

}
