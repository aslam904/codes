package com.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.bean.Product;
import com.resource.DbResource;


public class ProductDao {

	public int storeProduct(Product prd) {
		try {
			SessionFactory sf=DbResource.getSessionFactory();
			Session session=sf.openSession();
			Transaction tran=session.getTransaction();
			tran.begin();
			session.save(prd);
			tran.commit();
			return 1;
		}catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
}
