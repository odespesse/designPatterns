package state;

public class Open implements State {

	@Override
	public void open(Door door) {
		System.out.println("Door already opened : nothing to do");
	}

	@Override
	public void close(Door door) {
		System.out.println("Closing the door");
		door.setState(new Close());
	}

}
