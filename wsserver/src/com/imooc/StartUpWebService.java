package com.imooc;

import javax.xml.ws.Endpoint;
/*
 * Æô¶¯webservice·þÎñ
 */
public class StartUpWebService {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String address="http://127.0.0.1:8000/web/service/test";
		IWebService webServer=new WebServiceImpl();
		Endpoint.publish(address, webServer);
		System.out.println("web server started");
	}

}
