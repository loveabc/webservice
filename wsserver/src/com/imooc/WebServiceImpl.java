package com.imooc;

import javax.jws.WebService;
/*
 * WebService�ӿڵ�ʵ����
 * ��E�̸�Ŀ¼��ִ��������������,
 * �ͻ��˸���wsdl�ļ���·������class(����·��E://com//imooc)
 * wsimport -cvf http://127.0.0.1:8000/web/service/test
 * ��class���Ϊ jar
 * jar -cvf e://ws//client.jar e://com//imooc 
 * jar���������������,
 * 1��MyService,������@WebService�е�serviceName
 * 2������MyService��getMyServicePort()�����õ�IWebServiceʵ������
 * 3�����øö�����Ӧ�ķ�������ȡ��Ӧ�ķ���
 * 1��jar����ͻ��˳���,
 */
@WebService(serviceName="MyService",portName="MyServicePort",endpointInterface="com.imooc.IWebService")
public class WebServiceImpl implements IWebService {

	public String print() {
		return "hello web service oo";
	}

}
