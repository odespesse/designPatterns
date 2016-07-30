package proxy;

public class Main {

	public static void main(String[] args) {
		Database db = new ProxyDatabase();
		db.query("select * from tableA");
		db.query("select * from tableB");
	}
}
