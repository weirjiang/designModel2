package com.weir.designModel.singletonPatten;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LoadBalancer {
	private static LoadBalancer instance = null;
	private List serviceList = null;

	public LoadBalancer() {
		serviceList = new ArrayList<Object>();
	}

	public static LoadBalancer getLoadBalancer() {
		if (instance == null) {
			instance = new LoadBalancer();
		}
		return instance;
	}

	public void addServer(String server) {
		serviceList.add(server);
	}

	public void removeServer(String server) {
		serviceList.remove(server);

	}

	public String getServer() {
		Random random = new Random();
		int i = random.nextInt(serviceList.size());
		return (String) serviceList.get(i);
	}
}
