package com.thejavageek.designpatterns;

public class RectangleAdapter implements Square {

	Rectangle rectangle = null;
	
	public RectangleAdapter(Rectangle rectangle){
		this.rectangle = rectangle;
	}
	
	@Override
	public int calculateArea(int length) {
		return rectangle.calculateArea(length, length);
	}

}
