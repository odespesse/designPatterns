package strategy;

import strategy.Main.Weather;

public class General {

	private Strategy strategy;

	public void followThePlan(Weather weather) {
		this.strategy = this.chooseStrategy(weather);
		this.strategy.executePlan();
	}

	private Strategy chooseStrategy(Weather weather) {
		Strategy strategy;
		if (weather == Weather.SUN) {
			strategy = new SunStrategy();
		} else {
			strategy = new RainStrategy();
		}
		return strategy;
	}
}
