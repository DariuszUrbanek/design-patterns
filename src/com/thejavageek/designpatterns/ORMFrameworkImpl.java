package com.thejavageek.designpatterns;

public class ORMFrameworkImpl implements ORMFramework {

	private JPA implementor;

	public ORMFrameworkImpl(JPA imp) {
		this.implementor = imp;
	}

	@Override
	public void save(Object obj) {
		System.out.println("Calling implementor functionality");
		implementor.persist(obj);
	}

}
