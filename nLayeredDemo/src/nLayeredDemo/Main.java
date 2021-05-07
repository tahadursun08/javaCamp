package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concrete.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//ToDo: will be solved with Spring IoC 
		ProductService productService = new ProductManager(new AbcProductDao(),
				new JLoggerManagerAdapter());
		
		Product product1 = new Product(1,2,"Apple",5.0,5);
		productService.add(product1);
	}

}
