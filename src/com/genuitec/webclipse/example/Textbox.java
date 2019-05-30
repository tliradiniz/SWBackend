package com.genuitec.webclipse.example;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Textbox  {
	
	private String field;

	public Textbox() {}
	
	public Textbox(String string) {
		this.field = string;
		}
	
	

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}
	
	

}
