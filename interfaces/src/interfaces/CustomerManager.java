package interfaces;

import java.util.Iterator;

public class CustomerManager {
	//loosly coupled - tightly coupled (gevþek-katý baðlý)
	
	private Logger[] loggers;
	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}
	public void add(Customer customer) {
		System.out.println("Müþteri eklendi." + customer.getFirstName());
				
		Utils.runLoggers(loggers,customer.getFirstName());
	}
	public void delete(Customer customer) {
		System.out.println("Müþteri silindi." + customer.getFirstName());
		
		Utils.runLoggers(loggers, customer.getLastName());
	}
}
