package com.weir.designModel.decoratorPattern;

public class BlackBorderDecorator extends ComponentDecorator {
	public BlackBorderDecorator(Component component) {
		super(component);
		// TODO Auto-generated constructor stub
	}
	public void display(){
		this.setBlackBorder();
		super.display();
	}
	public void setBlackBorder(){
		 System.out.println("为构件增加黑色边框！");
	}
}
