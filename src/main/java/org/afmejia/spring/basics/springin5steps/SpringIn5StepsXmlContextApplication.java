package org.afmejia.spring.basics.springin5steps;

import org.afmejia.spring.basics.springin5steps.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIn5StepsXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")){
			LOGGER.info("Beans Loaded -> {}", (Object)applicationContext.getBeanDefinitionNames());
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			LOGGER.info("{}, {}", personDao, personDao.getXmlJdbcConnection());
		}
	}

}
