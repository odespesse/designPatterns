package state;

public class Close implements State {

	@Override
	public void open(Door door) {
		System.out.println("Opening the door");
		door.setState(new Open());
	}

	@Override
	public void close(Door door) {
		System.out.println("Door already closed : nothing to do");
	}
}
