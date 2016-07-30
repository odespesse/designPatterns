package proxy;

public class ProxyDatabase implements Database {

	private DatabaseImpl db;

	@Override
	public void query(String query) {
		if (this.db == null) {
		    System.out.println("Connection to the database...");
            this.db = new DatabaseImpl();
        } else {
            System.out.println("Reusing the previous connection");
        }
		db.query(query);
	}
}
