package state;

public class Door {

	private State state = new Close();

	public void setState(State state) {
		this.state = state;
	}
	
	public void open() {
		state.open(this);
	}

	public void close() {
		state.close(this);
	}
}
