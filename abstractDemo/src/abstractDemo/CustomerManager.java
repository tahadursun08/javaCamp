package abstractDemo;

public class CustomerManager {
	private BaseDatabaseManager[] databaseManager; 
	
	public CustomerManager(BaseDatabaseManager[] databaseManager) {
		this.databaseManager = databaseManager;
	}

	public void getCustomers() {
		for (BaseDatabaseManager baseDatabaseManager : databaseManager) {
			baseDatabaseManager.getData();
		}
	}
}
