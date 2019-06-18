package com.weir.designModel.facadePattern;

public class Client {
	public static void main(String args[]){
		EncryptFacade encryptFacade = new EncryptFacade();
		encryptFacade.FileEncrypt("src.txt", "src.txt");
	}
}
