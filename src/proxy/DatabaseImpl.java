package proxy;

public class DatabaseImpl implements Database {

	@Override
	public void query(String query) {
		System.out.println("\tExecute the following query : " + query);
	}
}
