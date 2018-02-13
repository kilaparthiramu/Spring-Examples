package com.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class Main {

	public static void main(String args[]) {

		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Object o = beanFactory.getBean("employee");
		if (o instanceof Employee) {
			Employee employee = (Employee) o;
			employee.display();
		}
	}

}
