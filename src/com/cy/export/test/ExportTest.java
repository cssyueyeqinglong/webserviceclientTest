package com.cy.export.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;


public class ExportTest {

	public static void main(String[] args) throws Exception {
		JaxWsProxyFactoryBean proxy  = new JaxWsProxyFactoryBean();
		
		proxy.setAddress("http://localhost:8080/export/ws/weather?wsdl");
		proxy.setServiceClass(com.cy.export.service.WeatherService.class);

		com.cy.export.service.WeatherService es = (com.cy.export.service.WeatherService) proxy.create();
		
		String result = es.showWeater("{exportId:'454534',inputDate:'2016-12-12',shipmentPort:'北京',destinationPort:'上海',transportMode:'陆运',priceCondition:'L/C',boxNums:'3',grossWeights:'200',measurements:'500'"+
		",products:[{exportProductId:'ep001',factoryId:'111',productNo:'222',packingUnit:'333',cnumber:'444',boxNum:'555',grossWeight:'666',netWeight:'777',sizeLength:'888',sizeWidth:'999',sizeHeight:'1000',exPrice:'1001',price:'1002',tax:'1003'}]"+"}");
		
		
		System.out.println(result);
	}

}
