package com.javaweb.dao.impl;

import com.javaweb.dao.ICategoryDAO;
import com.javaweb.mapper.CategoryMapper;
import com.javaweb.model.CategoryModel;
import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	

	@Override
	public List<CategoryModel> findAll() {
		
		String sql =" SELECT * FROM category ";
		return query(sql, new CategoryMapper());
	}

	@Override
	public CategoryModel findOne(long id) {
		String sql = "SELECT * FROM category WHERE id = ?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), id);
		return category.isEmpty() ? null : category.get(0);
		
	}

	@Override
	public CategoryModel findOneByCode(String code) {
		String sql = "SELECT * FROM category WHERE code = ?";
		List<CategoryModel> category = query(sql, new CategoryMapper(), code);
		return category.isEmpty() ? null : category.get(0);
	}



}
