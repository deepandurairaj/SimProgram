package com.training.model;

public class Vodafone implements Sim{
	private long mobileNumber;
	private String activeStatus;
	
	public Vodafone(long mobileNumber)
	{
		this.mobileNumber=mobileNumber;
		
	}
	
	public void makeCall() {
		if(activeStatus.equals("on"))
		{
			System.out.println("vodafone"+"mobile number is:"+mobileNumber);
		}
		else
		{
			System.out.println("Vodafone Sim not reachable");
		}
		
	}

	public void useData() {
		// TODO Auto-generated method stub
		
	}
	
	public void setActiveStatus(String activeStatus)
	{
		this.activeStatus=activeStatus;
	}
	
}
