package com.thejavageek.designpatterns;

public class AdapterTest {
	public static void main(String[] args) {
		Square square = new SquareImpl();
		Rectangle rectangle = new RectangleImpl();

		RectangleAdapter adapter = new RectangleAdapter(rectangle);
		System.out.println(adapter.calculateArea(10));

	}
}
