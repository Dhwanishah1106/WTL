package com.dhwani;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice 15 minutes daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
