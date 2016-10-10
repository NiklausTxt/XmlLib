package com.xmlPractic;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JAXB {
	public static void main(String[] args) {
		User user = new User();
		user.setScore(0);
		user.setUserName("user1");
		
		JAXBContext ctx;
		try {
			ctx=JAXBContext.newInstance(User.class);
			ctx.createMarshaller().marshal(user, new File("student.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
