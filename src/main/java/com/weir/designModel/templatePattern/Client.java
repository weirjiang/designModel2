package com.weir.designModel.templatePattern;


public class Client {
	public static void main(String args[]){
		Account account = new CurrentAccount();
		account.Handle("张无忌", "123456");
	}
}
