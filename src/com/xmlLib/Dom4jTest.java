package com.xmlLib;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4jTest {
	public static void main(String[] args) {
		try {
			SAXReader reader = new SAXReader();
			Document document = reader.read(new File("sample.xml"));
			
			Element root = document.getRootElement();
			
			List list = root.selectNodes("//student[./gender='Male']");
			
//			Iterator<Element> it = root.elementIterator();
			Iterator<Element> it = list.iterator();
			while(it.hasNext()){
				Element child = it.next();
				if(!"student".equals(child.getName())){
					continue;
				}
				
				System.out.println("--------student----------");
				System.out.println("id: "+child.attributeValue("id"));
				System.out.println("name: "+child.elementText("name"));
				System.out.println("gender: "+child.elementText("gender"));
				System.out.println("age: "+child.elementText("age"));
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
