package com.training.model;

public class Airtel implements Sim {
	private long mobileNumber;
	private String activeStatus;
	
	public Airtel(long mobileNumber)
	{
		this.mobileNumber=mobileNumber;
		
	}
	public void makeCall() {
		
		if(activeStatus.equals("on"))
		{
			System.out.println("Airtel"+"mobile number is:"+mobileNumber);
		}
		else
		{
			System.out.println("Airtel Sim not reachable");
		}
		
	}
	public void useData() {
		
		
	}
	
	public void setActiveStatus(String activeStatus)
	{
		this.activeStatus=activeStatus;
	}
	
		

	
	 
}
