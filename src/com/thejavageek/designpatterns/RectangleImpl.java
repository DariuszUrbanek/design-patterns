package com.thejavageek.designpatterns;

public class RectangleImpl implements Rectangle {

	@Override
	public int calculateArea(int length, int width) {
		return length * width;
	}

}
