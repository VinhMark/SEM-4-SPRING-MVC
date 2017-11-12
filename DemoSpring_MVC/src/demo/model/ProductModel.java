package demo.model;

import java.util.ArrayList;
import java.util.List;

import demo.entities.Product;

public class ProductModel {
	public Product find() {
		return new Product("pr01" , "product01" , 55);
	}
	
	public List<Product> findAll() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product("pr01" , "product01" , 55));
		products.add(new Product("pr02" , "product02" , 55));
		products.add(new Product("pr03" , "product03S" , 55));
		products.add(new Product("pr014" , "product04" , 55));
		return products;
	}
}
