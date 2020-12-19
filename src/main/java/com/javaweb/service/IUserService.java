package com.javaweb.service;



import com.javaweb.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
	UserModel save(UserModel userModel);
	UserModel update(UserModel updateUser);
	void delete(long[] ids);
	UserModel findOne(long id);
}

