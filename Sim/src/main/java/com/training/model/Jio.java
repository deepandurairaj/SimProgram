package com.training.model;

public class Jio implements Sim{
	private long mobileNumber;
	private String activeStatus;
	
	public Jio(long mobileNumber)
	{
		this.mobileNumber=mobileNumber;
		
	}
	public void makeCall() {
		if(activeStatus.equals("on"))
		{
			System.out.println("Jio"+"mobile number is:"+mobileNumber);
		}
		else
		{
			System.out.println("Jio Sim not reachable");
		}
		
	}
		

	public void useData() {
		
	}


	

	public void setActiveStatus(String activeStatus)
	{
		this.activeStatus=activeStatus;
	}
	
	
}
