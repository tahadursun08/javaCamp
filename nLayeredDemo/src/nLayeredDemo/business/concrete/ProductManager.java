package nLayeredDemo.business.concrete;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao productDao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {
		this.productDao = productDao;
		this.loggerService=loggerService;
	}

	public void add(Product product) {
		if (product.getCategoryId()==1) {
			System.out.println("Products are not accepted in this category.");
			return;
		}
		
		this.productDao.add(product);
		this.loggerService.logToSystem("�r�n Eklendi. " + product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}