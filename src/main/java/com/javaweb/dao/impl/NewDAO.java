package com.javaweb.dao.impl;

import java.util.List;

import com.javaweb.dao.INewDAO;
import com.javaweb.mapper.NewMapper;
import com.javaweb.model.NewModel;
import com.javaweb.paging.Pageble;

public class NewDAO extends AbstractDAO<NewModel> implements INewDAO {

	@Override
	public List<NewModel> findByCategoryId(Long categoryid) {

		String sql = " SELECT * FROM news WHERE categoryid =? ";
		return query(sql, new NewMapper(), categoryid);
	}

	@Override
	public Long save(NewModel newModel) {
		StringBuilder sql = new StringBuilder("INSERT INTO news ( title, content,");
		sql.append(" thumbnail,shortdescription, categoryId, price,");
		sql.append(" deposit, adress, sonha, tenduong, dientich, succhua,");
		sql.append(" name, sdt, priceE, priceW, priceOther) ");
		sql.append(" VALUES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");

		return insert(sql.toString(), newModel.getTitle(), newModel.getContent(),
				newModel.getThumbnail(), newModel.getShortDescription(), newModel.getCategoryId(), newModel.getPrice(),
				newModel.getDeposit(), newModel.getSonha(), newModel.getTenduong(),newModel.getDientich(),
				newModel.getSucchua(), newModel.getGtinh(),newModel.getName(), newModel.getSdt(),
				newModel.getPriceE(), newModel.getPriceW(),newModel.getPriceOther());


	}

	@Override
	public NewModel findOne(Long id) {
		String sql = " SELECT * FROM news WHERE id =? ";
		List<NewModel> news = query(sql, new NewMapper(), id);
		return news.get(0); // is emty lỗi trả về null

	}

	@Override
	public void update(NewModel updateNew) {
		StringBuilder sql = new StringBuilder("UPDATE news SET title = ?, thumbnail = ?,");
		sql.append(" shortdescription = ?, content = ?, categoryid = ?, price = ?,");
		sql.append(" deposit = ?, sonha = ?, tenduong = ?, dientich = ?,");
		sql.append(" succhua = ?, Gtinh = ?, name = ?, sdt = ?, priceE = ? ,priceW =?, priceOther =? WHERE id = ? ");

		update(sql.toString(), updateNew.getTitle(), updateNew.getThumbnail(), updateNew.getShortDescription(),
				updateNew.getContent(), updateNew.getCategoryId(), updateNew.getPrice(),
				updateNew.getDeposit(), updateNew.getSonha(), updateNew.getTenduong(),updateNew.getDientich(),
				updateNew.getSucchua(), updateNew.getGtinh(),updateNew.getName(), updateNew.getSdt(),
				updateNew.getPriceE(), updateNew.getPriceW(),updateNew.getPriceOther(),updateNew.getId());

	}

	@Override
	public void delete(long id) {
		
		String sql = "DELETE FROM news WHERE id = ?";
		update(sql, id);

	}

	@Override
	public List<NewModel> findAll() {
		String sql = " SELECT * FROM news  ";
		
		return query(sql, new NewMapper());
		
	}

	@Override
	public Long getTotalItem() {
		String sql = "SELECT count(*) FROM news";
		//return count(sql);
		return null;
	}

	
}
