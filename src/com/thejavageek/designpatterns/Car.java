package com.thejavageek.designpatterns;

import java.util.ArrayList;
import java.util.List;

public class Car implements Component {

	private List<Component> parts = new ArrayList<Component>();
	private String name;
	
	
	public Car(String name) {
		this.name = name;
	}

	@Override
	public void printDetails() {
		System.out.println(this.name);
		for(Component c : parts){
			System.out.println("    " + ((Part)c).getName());
		}
	}
	
	public void addPart(Component part){
		this.parts.add(part);
	}

}
