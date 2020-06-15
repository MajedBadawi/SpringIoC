package com.majedbadawi.springIoC;

public class BaseballCoach implements Coach{
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in Baseball";
	}
}
