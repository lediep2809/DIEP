package com.javaweb.dao;

import com.javaweb.mapper.RowMapper;

import java.util.List;

public interface GenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	void update(String sql, Object... prameters );
	Long insert(String sql, Object... prameters );
	Long count(String sql, Object... parameters);
}
