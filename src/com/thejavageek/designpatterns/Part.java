package com.thejavageek.designpatterns;

public class Part implements Component {

	private String name;

	public Part(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public void printDetails() {
		System.out.println(this.getName());
	}

}
