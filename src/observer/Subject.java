package observer;

import java.util.HashSet;
import java.util.Set;

public abstract class Subject {
	
	private Set<Observer> observers = new HashSet<Observer>();
	
	public void register(Observer observer)
	{
		observers.add(observer);
	}
	
	protected void notifyObservers()
	{
		for(Observer observer : observers)
		{
			observer.update();
		}
	}
}
