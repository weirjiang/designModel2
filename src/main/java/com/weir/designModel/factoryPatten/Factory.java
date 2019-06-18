package com.weir.designModel.factoryPatten;

public class Factory {
	public static Product getProduct(String productType) {
		if (productType.equals("A")) {
			return new ConcreteProductA();
		}
		if (productType.equals("B")) {
			return new ConcreteProductB();
		}
		return null;
	}
}
