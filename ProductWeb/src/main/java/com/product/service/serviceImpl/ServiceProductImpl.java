package com.product.service.serviceImpl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.product.dao.daoImpl.ProductDaoImpl;
import com.product.dbconnection.ConnectionProvider;
import com.product.model.Product;
import com.product.service.ServiceProduct;

public class ServiceProductImpl implements ServiceProduct 
{
	Connection connection = ConnectionProvider.getConnection();

	@Override
	public List<Product> productServiceList() throws SQLException, ClassNotFoundException {
//		Connection connection = ConnectionProvider.getConnection();
		ProductDaoImpl dao = new ProductDaoImpl(connection);
		List<Product> product = dao.productList();
		return product;
	}

	@Override
	public int createServiceProduct(Product product) throws SQLException, ClassNotFoundException {
//		Connection connection = ConnectionProvider.getConnection();
		ProductDaoImpl dao = new ProductDaoImpl(connection);
		
		int insert = dao.createProduct(product);
		return insert;
	}

	@Override
	public int updateServiceProduct(Product product) throws SQLException, ClassNotFoundException {
//		Connection connection = ConnectionProvider.getConnection();
		ProductDaoImpl dao = new ProductDaoImpl(connection);
		
		int update = dao.updateProduct(product);
		return update;
	}

	@Override
	public int deleteServiceProduct(int id) throws SQLException, ClassNotFoundException {
//		Connection connection = ConnectionProvider.getConnection();
		ProductDaoImpl dao = new ProductDaoImpl(connection);
		
		int delete = dao.deleteProduct(id);
		return delete;
	}

	@Override
	public Product getById(int id) throws SQLException, ClassNotFoundException {
		ProductDaoImpl dao = new ProductDaoImpl(connection);
		Product product = dao.getProductById(id);
		return product;
	}
	
	@Override
	public Product getByName(String name) throws SQLException, ClassNotFoundException {
		ProductDaoImpl dao = new ProductDaoImpl(connection);
		Product product = dao.getProductByName(name);
		return product;
	}

}
