package com.thejavageek.designpatterns;

public class Engine implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
