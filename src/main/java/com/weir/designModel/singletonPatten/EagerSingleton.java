package com.weir.designModel.singletonPatten;

public class EagerSingleton {
	   private static final EagerSingleton instance = new EagerSingleton(); 
	    private EagerSingleton() { } 
	 
	    public static EagerSingleton getInstance() {
	        return instance; 
	    }  
}
