package com.dress.repository;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.dress.model.Dress;

public class DressMapper implements RowMapper<Dress> {

	@Override
	public Dress mapRow(ResultSet rs, int rowNum) throws SQLException {
		Dress dress=new Dress();
		dress.setName(rs.getString("name"));
		dress.setId(rs.getInt("id"));
		dress.setColour(rs.getString("colour"));
		dress.setBrand(rs.getString("brand"));
		dress.setType(rs.getString("type"));
		dress.setSize(rs.getString("size"));
		dress.setCategory(rs.getString("category"));
		dress.setPrice(rs.getDouble("price"));
		return dress;
	}

	

}
