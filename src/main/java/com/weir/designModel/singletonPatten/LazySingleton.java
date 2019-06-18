package com.weir.designModel.singletonPatten;

public class LazySingleton {
	private static LazySingleton instance = null;

	private LazySingleton() {
	}

	// synchronized public static LazySingleton getInstance() {
	// if (instance == null) {
	// instance = new LazySingleton();
	// }
	// return instance;
	// }
	public static LazySingleton getInstance() {
		if (instance == null)

		{
			synchronized (LazySingleton.class) {
				instance = new LazySingleton();
			}
		}
		return instance;
	}
}
