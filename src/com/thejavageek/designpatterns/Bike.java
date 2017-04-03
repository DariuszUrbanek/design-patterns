package com.thejavageek.designpatterns;

public class Bike implements Prototype{
	private String manufacturer; 
	private int engineCapacity;
	
	public Bike(String manufacturer, int engineCapacity) throws InterruptedException{
		
		this.manufacturer = manufacturer;
		this.engineCapacity = engineCapacity;
		long start = System.currentTimeMillis();
		Thread.sleep(2000);
		long end = System.currentTimeMillis();
		System.out.println("Time required = " + (end - start));
		
	}
	
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public int getEngineCapacity() {
		return engineCapacity;
	}
	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}
	
	public Prototype clone() throws CloneNotSupportedException{
		return (Bike)super.clone();
	}
	
	
}
