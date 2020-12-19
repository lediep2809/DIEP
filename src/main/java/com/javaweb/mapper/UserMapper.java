package com.javaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.javaweb.model.NewModel;
import com.javaweb.model.RoleModel;
import com.javaweb.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel mapRow(ResultSet resultSet) {

		try {
			UserModel user = new UserModel();
			user.setUserName(resultSet.getString("username"));
			user.setFullName(resultSet.getString("fullname"));
			user.setPassword(resultSet.getString("password"));
			user.setStatus(resultSet.getInt("status"));
			user.setRoleId(resultSet.getLong("roleId"));
			user.setId(resultSet.getLong("id"));

			try {
				RoleModel role = new RoleModel();
				role.setCode(resultSet.getString("code"));
				role.setName(resultSet.getString("name"));
				user.setRole(role);
			} catch (Exception e) {
				System.out.print(e.getMessage());
			}
			return user;
		} catch (SQLException e) {
			return null;
		}	
	}
}


