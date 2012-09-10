package com.redhat.client;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.URI;
import org.apache.commons.httpclient.methods.GetMethod;

public class MainClient {

	public static void main(String args[]) {
		executeHttpGet();
	}

	private static void executeHttpGet() {
		try {
			HttpClient client = new HttpClient();
			GetMethod getMethod = new GetMethod();
			String url = "http://localhost:8080/SpringMVC/jobLauncher.htm";
			URI uri = new URI(url);
			getMethod.setURI(uri);
			client.executeMethod(getMethod);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
