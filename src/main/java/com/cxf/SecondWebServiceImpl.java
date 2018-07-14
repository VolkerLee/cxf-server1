package com.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * 加入注解使服务接口规范
 * 
 * @author volker
 *
 */

@WebService(targetNamespace = "http://weather.com.cn/",serviceName="WeatherWS", name = "WeatherWSSoap", portName = "WeatherWSHttpGet")
public class SecondWebServiceImpl implements SecondWebService {
	
	@WebMethod(operationName="todayWeather",exclude=false)
	@Override
	public @WebResult(name="result") String todayWeather(@WebParam(name="city") String city) {
		if ("杭州".equals(city)) {
			return "晴空万里";
		} else if ("阜阳".equals(city)) {
			return "乌云密布";
		}
		return "大雨倾盆";
	}

}
