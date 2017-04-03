package com.thejavageek.designpatterns;

public class EclipseLink implements JPA {

	@Override
	public void persist(Object obj) {
		System.out.println("Saving " + obj + " in EclipseLink way");
	}

}
