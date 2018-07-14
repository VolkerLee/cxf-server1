package com.cxf;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;
import org.junit.Test;

public class TestDemo {

	public static void main(String[] args) {
		//cxf发布服务
		//创建jaxWsServerFactoryBean
		JaxWsServerFactoryBean js= new JaxWsServerFactoryBean();
		//设置服务地址
		js.setAddress("http://localhost:9090/ws/todayWeather");
		//创建服务接口
		//js.setServiceClass(SecondWebService.class);
		//创建实现类
		js.setServiceBean(new SecondWebServiceImpl());
		//发布
		js.create();
		System.out.println("success");
	}

}
