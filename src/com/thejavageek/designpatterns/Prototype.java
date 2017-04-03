package com.thejavageek.designpatterns;

public interface Prototype extends Cloneable {
	public Prototype clone() throws CloneNotSupportedException;
}
