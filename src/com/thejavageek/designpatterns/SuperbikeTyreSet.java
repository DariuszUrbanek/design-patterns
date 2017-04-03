package com.thejavageek.designpatterns;

public class SuperbikeTyreSet implements TyreSet {
	SuperbikeTyreSet() {
		System.out.println("Creating Super bike tyres");
	}

	public String toString() {
		return "SuperbikeTyreSet";
	}
}
