package com.xmlJAXB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class JAXB {
	public static void main(String[] args) {
		Student student = new Student();
		student.setAge(11);
		student.setGender("male");
		student.setName("Bob");
		student.setId(111);
		
		JAXBContext ctx;
		try {
			ctx=JAXBContext.newInstance(Student.class);
			ctx.createMarshaller().marshal(student, new File("student.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}
}
