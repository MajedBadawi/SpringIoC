package com.majedbadawi.springIoC;

public class TrackCoach implements Coach {
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes in Track";
	}
}