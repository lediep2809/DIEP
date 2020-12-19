package com.javaweb.dao.impl;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.List;
import java.security.NoSuchAlgorithmException;
import com.javaweb.dao.IUserDAO;
import com.javaweb.mapper.NewMapper;
import com.javaweb.mapper.UserMapper;
import com.javaweb.model.NewModel;
import com.javaweb.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO  {

	@Override
	public UserModel 	findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {

		StringBuilder sql = new StringBuilder("SELECT * FROM user AS u");
		sql.append(" INNER JOIN role AS r ON r.id = u.roleid");
		sql.append(" WHERE username = ? AND password = ? AND status = ?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), userName, password, status);
		return  users.get(0);
	}

	@Override
	public Long save(UserModel userModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO user (username, password,");
		sql.append("fullname, status, roleid)");
		sql.append(" VALUES(?, ?, ?, ?, ?)");
		return insert(toString(),userModel.getUserName(),userModel.getPassword(),userModel.getFullName(),
				userModel.getStatus(),userModel.getRoleId());

	}

	@Override
	public void update(UserModel updateUser) {
		
		StringBuilder sql = new StringBuilder("UPDATE user SET username= ?, password =?,");
		sql.append("fullname = ?, status =? , roleid= ?)");
		update(sql.toString(),updateUser.getUserName() , updateUser.getPassword(), updateUser.getFullName(), 
				updateUser.getStatus() , updateUser.getRoleId());
		
	}

	@Override
	public void delete(long id) {
		String sql = "DELETE FROM user WHERE id = ?";
		update(sql, id);
	}

	@Override
	public String md5(String password) {

		String result = "";
		MessageDigest digest;
		try {
			digest = MessageDigest.getInstance("MD5");
			digest.update(password.getBytes());
			BigInteger bigInteger = new BigInteger(1,digest.digest());
			result = bigInteger.toString(16);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public UserModel findOne(Long id) {
		String sql =  " SELECT * FROM user WHERE id =? ";
		List<UserModel> user = query(sql, new UserMapper(), id);
		return user.get(0); // is emty lỗi trả về null
	}


}
