package com.weir.designModel.templatePattern;

public abstract class Account {
	// 基本方法——具体方法
	public boolean Validate(String account, String password) {
		System.out.println("账号：{0}" + account);
		System.out.println("密码：{0}" + password);
		// 模拟登录
		if (account.equals("张无忌") && password.equals("123456")) {
			return true;
		} else {
			return false;
		}
	}

	// 基本方法——抽象方法
	public abstract void calculateInterest();
	

    //基本方法——具体方法
    public void display() 
    {
        System.out.println("显示利息！");
    }

    //模板方法
    public void Handle(String account, String password) 
    {
	    if (!Validate(account,password)) 
        {
	    	 System.out.println("账户或密码错误！");
		    return;
	    }
	    calculateInterest();
	    display();
    }

}
