package com.service;

import com.bean.Product;
import com.dao.ProductDao;

public class ProductService {

	ProductDao pd=new ProductDao();
	public String storeProduct(Product prd) {
		if(pd.storeProduct(prd)>0) {
			return "Record added successfully";
		}else {
			return "Error";
		}
	}
	
}
