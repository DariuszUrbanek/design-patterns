package com.thejavageek.designpatterns;

public class Application {
	public static void main(String args[]) {
		
		JPA hibernate = new Hibernate();
		JPA eclipseLink = new EclipseLink();
		
		ORMFramework framework = new ORMFrameworkImpl(hibernate);
		framework.save("prasad");
		
		framework = new ORMFrameworkImpl(eclipseLink);
		framework.save("kharkar");
		
	}
}
