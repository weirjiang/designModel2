package com.weir.designModel.observerPattern;

//战队成员类：具体观察者类
public class Player implements Observer {
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public void setName(String name) {
		this.name = name;

	}

	public void help() {
		System.out.println("坚持住，" + this.name + "来救你！");

	}

	public void beAttacked(AllyControlCenter acc) {
		// TODO Auto-generated method stub
		System.out.println(this.name + "被攻击！");
		acc.notifyObserver(name);
	}

}
