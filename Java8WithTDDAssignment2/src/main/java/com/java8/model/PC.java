package com.java8.model;

public class PC extends Computer{

	private String ram;
	private String hdd;
	private String cpu;
	
	
	public PC(String ram, String hdd, String cpu) {
		super();
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return hdd;
	}
	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return cpu;
	}

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return ram;
	}
	
	
	
}
