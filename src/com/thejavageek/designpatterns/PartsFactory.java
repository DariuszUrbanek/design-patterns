package com.thejavageek.designpatterns;

public interface PartsFactory {
	public abstract Engine createEngine();

	public abstract TyreSet createTyreSet();
}
