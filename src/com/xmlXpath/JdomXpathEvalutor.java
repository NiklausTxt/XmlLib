package com.xmlXpath;

import java.io.IOException;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.xpath.XPathExpression;
import org.jdom2.xpath.XPathFactory;
import org.jdom2.xpath.jaxen.JaxenXPathFactory;

public class JdomXpathEvalutor {
	public static void main(String[] args) {
		
		try {
			SAXBuilder builder = new SAXBuilder();
			Document document;
			document = builder.build("sample.xml");
			Element root = document.getRootElement();
			
			XPathFactory factory = JaxenXPathFactory.instance();
			XPathExpression<Object> xPathExp = factory.compile("//student[./gender='Male']");
			
			List<Object> objectList = xPathExp.diagnose(root, false).getResult();
			
			for(Object obj:objectList){
				Element child = (Element) obj;
				if(!"student".equals(child.getName())){
					continue;
				}
				
				System.out.println("--------student----------");
				System.out.println("id: "+child.getAttributeValue("id"));
				System.out.println("name: "+child.getChildText("name"));
				System.out.println("gender: "+child.getChildText("gender"));
				System.out.println("age: "+child.getChildText("age"));
			}
			
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
