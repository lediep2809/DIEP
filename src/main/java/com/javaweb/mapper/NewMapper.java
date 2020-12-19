package com.javaweb.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.javaweb.model.NewModel;

public class NewMapper implements RowMapper<NewModel> {


	@Override
	public NewModel mapRow(ResultSet resultSet) {
		try {

			NewModel news = new NewModel();
			news.setId(resultSet.getLong("id"));
			news.setTitle(resultSet.getString("title"));
			news.setContent(resultSet.getString("content"));
			news.setPrice(resultSet.getString("price"));
			news.setCategoryId(resultSet.getLong("categoryId"));
			news.setThumbnail(resultSet.getString("thumbnail"));
			news.setShortDescription(resultSet.getString("shortdescription"));
			//news.setCreatedDate(resultSet.getTimestamp("createddate"));
			news.setDeposit(resultSet.getString("deposit"));
			news.setAdress(resultSet.getString("adress"));
			news.setSonha(resultSet.getString("sonha"));
			news.setTenduong(resultSet.getString("tenduong"));
			news.setDientich(resultSet.getString("dientich"));
			news.setSucchua(resultSet.getString("succhua"));
			news.setGtinh(resultSet.getLong("Gtinh"));
			news.setName(resultSet.getString("name"));
			news.setSdt(resultSet.getLong("sdt"));
			news.setPriceE(resultSet.getString("priceE"));
			news.setPriceW(resultSet.getString("priceW"));
			news.setPriceOther(resultSet.getString("priceOther"));

//			if (resultSet.getTimestamp("modifieddate") != null) {
//				news.setModifiedDate(resultSet.getTimestamp("modifieddate"));
//			}
//			if (resultSet.getString("modifiedby") != null) {
//				news.setModifiedBy(resultSet.getString("modifiedby"));
//			}
			return news;
		} catch (SQLException e) {
			return null;
		}	
	}
}

