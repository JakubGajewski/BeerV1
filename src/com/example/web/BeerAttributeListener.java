package com.example.web;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class BeerAttributeListener implements HttpSessionAttributeListener {

	@Override
	public void attributeAdded(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object val = event.getValue();
		//Tomcat ���������� tomcat/log/catalina.log�ļ���
		System.out.println("Attribute added:" + name + ":" + val);
	}

	@Override
	public void attributeRemoved(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object val = event.getValue();
		System.out.println("Attribute removed:" + name + ":" + val);
	}

	@Override
	public void attributeReplaced(HttpSessionBindingEvent event) {
		String name = event.getName();
		Object val = event.getValue();
		System.out.println("Attribute replaced:" + name + ":" + val);
	}
	
}
