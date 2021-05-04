package abstractDemo;

public class Main {

	public static void main(String[] args) {
		BaseDatabaseManager[] baseDatabaseManager= {
			new MySqlDatabaseManager(),
			new OracleDatabaseManager(),
			new SqlServerDatabaseManager()
		};
		CustomerManager customerManager=new CustomerManager(baseDatabaseManager);
		customerManager.getCustomers();
	}

}
