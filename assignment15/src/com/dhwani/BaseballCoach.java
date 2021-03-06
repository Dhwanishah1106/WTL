package com.dhwani;

public class BaseballCoach implements Coach {
		private FortuneService fortuneService;
		
		public BaseballCoach(FortuneService fortuneService) {
			this.fortuneService = fortuneService;
		}

		@Override
		public String getDailyWorkOut() {
			return "Practice 1 hour daily";
		}

		@Override
		public String getDailyFortune() {
			return fortuneService.getFortune();
		}
		
	}
