package com.imooc;

import javax.jws.WebService;
/*
 * WebService接口的实现类
 * 在E盘根目录下执行下面两条命令,
 * 客户端根据wsdl文件的路径生成class(生成路径E://com//imooc)
 * wsimport -cvf http://127.0.0.1:8000/web/service/test
 * 将class打包为 jar
 * jar -cvf e://ws//client.jar e://com//imooc 
 * jar包里面包含几个类,
 * 1、MyService,类名是@WebService中的serviceName
 * 2、调用MyService的getMyServicePort()方法得到IWebService实例对象
 * 3、调用该对象相应的方法即获取相应的服务
 * 1将jar导入客户端程序,
 */
@WebService(serviceName="MyService",portName="MyServicePort",endpointInterface="com.imooc.IWebService")
public class WebServiceImpl implements IWebService {

	public String print() {
		return "hello web service oo";
	}

}
