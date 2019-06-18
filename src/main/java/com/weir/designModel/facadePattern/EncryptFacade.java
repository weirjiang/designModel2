package com.weir.designModel.facadePattern;

public class EncryptFacade {
	private FileReader fileReader;
	private FileWriter fileWriter;
	private CipherMachine cipherMachine;
	public EncryptFacade(){
		fileReader = new FileReader();
		fileWriter = new FileWriter();
		cipherMachine = new CipherMachine();
	}
	 public void FileEncrypt(String fileNameSrc, String fileNameDes){
		 String plainStr = fileReader.read(fileNameSrc);
         String encryptStr = cipherMachine.Encrypt(plainStr);
         fileWriter.Write(encryptStr, fileNameDes);
	 }
}
