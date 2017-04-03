package com.thejavageek.designpatterns;

public class Dealer {
	public static void main(String[] args) {

		// separately creating parts which are leaf nodes
		Part engine = new Part("Engine");
		Part wheels = new Part("Wheels");
		Part doors = new Part("doors");

		// Creating a composite object i.e. Car which can have multiple
		// accessories i.e. it is composed of multiples objects
		Car car = new Car("Honda");
		car.addPart(engine);
		car.addPart(wheels);

		/// we are performing operation on leaf.
		engine.printDetails();

		// performing operation on composite object
		car.printDetails();

	}
}
