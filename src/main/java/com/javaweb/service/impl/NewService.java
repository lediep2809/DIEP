package com.javaweb.service.impl;

import com.javaweb.dao.ICategoryDAO;
import com.javaweb.dao.INewDAO;
import com.javaweb.model.CategoryModel;
import com.javaweb.model.NewModel;
import com.javaweb.paging.Pageble;
import com.javaweb.service.INewService;

import javax.inject.Inject;
import java.sql.Timestamp;
import java.util.List;

public class NewService implements INewService {

	@Inject
	private INewDAO newDao;

	@Inject
	private ICategoryDAO categoryDAO;
	
    @Override
    public List<NewModel> findByCategoryId(Long categoryId) {
        return newDao.findByCategoryId(categoryId);
    }

    @Override
    public NewModel save(NewModel newModel) {
    	
    	Long newId = newDao.save(newModel);
        return newDao.findOne(newId);
    }

    @Override
    public NewModel update(NewModel updateNew) {
    	
    	NewModel oldNew = newDao.findOne(updateNew.getId());
		//CategoryModel category = categoryDAO.findOneByCode(updateNew.getCategoryCode());
		//updateNew.setCategoryId(category.getId());
		newDao.update(updateNew);
		return newDao.findOne(updateNew.getId());
    }

    @Override
    public void delete(long[] ids) {
    	for (long id: ids) {
			//1.delete comment (khoa ngoai new_id)
			//2.delete news
			newDao.delete(id);
    	}
    }

    @Override
    public List<NewModel> findAll() {
        
    	return newDao.findAll();
    }

    @Override
    public int getTotalItem() {
        return 0;
    }

    @Override
    public NewModel findOne(long id) {
        NewModel newModel = newDao.findOne(id);
        CategoryModel categoryModel = categoryDAO.findOne(newModel.getCategoryId());
        newModel.setCategoryCode(categoryModel.getCode());
        return newModel;

    }
}
