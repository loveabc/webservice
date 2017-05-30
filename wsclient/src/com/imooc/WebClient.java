package com.imooc;


public class WebClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyService service=new MyService();
		IWebService server=service.getMyServicePort();
		String str=server.print();
		System.out.println(str);
	}

}
