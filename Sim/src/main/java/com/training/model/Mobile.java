package com.training.model;
public class Mobile {

	private Sim simOne;
	private Sim simTwo;
	private  String activeSim;
	
	public void setSimOne(Sim simOne) {
		this.simOne = simOne;
	}
	
	public void setSimTwo(Sim simTwo) {
		this.simTwo = simTwo;
	}
	
	public void setActiveSim(String activeSim) {
		this.activeSim = activeSim;
	}
	
	
	public void makeCall()
	{
		if(activeSim.equals("simOne"))
		{
			simOne.makeCall();
		}
		else if(activeSim.equals("simTwo"))
		{
			simTwo.makeCall();
		}
		else {
			System.out.println("No Sim");
		}
	}
	
	
	
	

}
