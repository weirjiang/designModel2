package com.weir.designModel.factoryPatten;

public class Client {
	public static void main(String args[]) {
		Product product;
		product = Factory.getProduct("A"); // 通过工厂类创建产品对象
		product.methodName();
		product.methodDiff();
	}

}
