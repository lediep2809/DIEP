package com.javaweb.service.impl;

import javax.inject.Inject;

import com.javaweb.dao.IUserDAO;
import com.javaweb.dao.impl.UserDAO;
import com.javaweb.model.CategoryModel;
import com.javaweb.model.NewModel;
import com.javaweb.model.RoleModel;
import com.javaweb.model.UserModel;
import com.javaweb.service.IUserService;

import java.sql.Timestamp;

public class UserService implements IUserService {

	@Inject
	private IUserDAO userDAO;

    @Override
    public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
        
    	return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
    }

    @Override
    public UserModel save(UserModel userModel) {
    
    	Long newId = userDAO.save(userModel);

         return userDAO.findOne(newId);
    }


    @Override
    public UserModel update(UserModel updateUser) {
//    	UserModel oldNew = userDAO.findOne(updateUser.getId());
    	userDAO.update(updateUser);
		return userDAO.findOne(updateUser.getId());
    }

    @Override
    public void delete(long[] ids) {
    	for (long id: ids) {
			//1.delete comment (khoa ngoai new_id)
			//2.delete news
			userDAO.delete(id);
    	}
    }

	@Override
	public UserModel findOne(long id) {

		return userDAO.findOne(id);

	}
}
