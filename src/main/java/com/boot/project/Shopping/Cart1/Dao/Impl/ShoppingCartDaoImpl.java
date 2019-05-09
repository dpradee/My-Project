package com.boot.project.Shopping.Cart.Dao.Impl;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.project.Shopping.Cart.Dao.ShoppingCartDao;
import com.boot.project.Shopping.Cart.Entity.Product;

@Transactional
@Repository
public class ShoppingCartDaoImpl implements ShoppingCartDao {
	private static final Logger log = LoggerFactory.getLogger(ShoppingCartDao.class);

	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Product getProduct(int productId) {
		log.debug("ShoppingCartDaoImpl Product getProduct Starts");
		String sql = "Select e from " + Product.class.getName() + " e Where e.productId =:productId ";
		Session session = this.sessionFactory.getCurrentSession();
		Query<Product> query = session.createQuery(sql, Product.class);
        query.setParameter("productId",productId);
        return (Product) query.getSingleResult();
	}
	
	

}
