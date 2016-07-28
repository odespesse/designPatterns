package observer;

public class Clock extends Subject {
	
	private int hour;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
		notifyObservers();
	}
}
