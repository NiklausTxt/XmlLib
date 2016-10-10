package com.xmlPractic;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.FIELD)

public class User {
	@XmlElement(name = "userName")
	private String userName;
	
	@XmlElement(name = "score")
	private int score;
	
	@XmlElement(name = "ask")
	private List<String[]> ask;

	public List<String[]> getAsk() {
		return ask;
	}
	public void setAsk(List<String[]> ask) {
		this.ask = ask;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
