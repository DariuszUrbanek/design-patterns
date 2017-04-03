package com.thejavageek.designpatterns;

public class SquareImpl implements Square {

	@Override
	public int calculateArea(int side) {
		return (int)Math.pow(side, 2);
	}

}
