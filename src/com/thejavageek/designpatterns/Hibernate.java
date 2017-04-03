package com.thejavageek.designpatterns;

public class Hibernate implements JPA {

	@Override
	public void persist(Object obj) {
		System.out.println("Saving " + obj + " in hibernate specific way");
	}

}
