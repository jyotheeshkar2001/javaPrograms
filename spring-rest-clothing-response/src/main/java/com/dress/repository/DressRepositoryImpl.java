package com.dress.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.dress.exceptions.DressNotFoundException;
import com.dress.model.Dress;
@Repository
public class DressRepositoryImpl implements IDressRepository{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	@Override
	public void addDress(Dress dress) {
        
		String sql="insert into dress(name,id,colour,brand,type,category,price,dresssize) values(?,?,?,?,?,?,?,?)";
		Object[] dressArray= {dress.getName(),dress.getId(),dress.getColour(),dress.getBrand(),dress.getType(),dress.getCategory(),dress.getPrice(),dress.getDresssize()};
		jdbcTemplate.update(sql,dressArray);
	}

	@Override
	public void updateDress(int id, double price) {
         String sql="update dress set price=? where id=?";
         jdbcTemplate.update(sql,price,id);
	}

	@Override
	public void deleteDress(int id) {
		String sql="delete from dress where id=?";
		jdbcTemplate.update(sql,id);
		
	}

	@Override
	public List<Dress> findAll() {
		String sql="select * from dress";
		
		return jdbcTemplate.query(sql,new DressMapper());
	}

	@Override
	public Optional<Dress> findById(int id) {
		
		Dress dress=null;
		String sql="select * from dress where id=?";
		try {
			 dress= jdbcTemplate.queryForObject(sql,(rs,rownum)->{
		
				Dress dress1=new Dress();
				dress1.setName(rs.getString("name"));
				dress1.setId(rs.getInt("id"));
				dress1.setColour(rs.getString("colour"));
				dress1.setBrand(rs.getString("brand"));
				dress1.setType(rs.getString("type"));
				dress1.setDresssize(rs.getString("dresssize"));
				dress1.setCategory(rs.getString("category"));
				dress1.setPrice(rs.getDouble("price"));
				return dress1;
				
				
				
			},id);
			}catch(DataAccessException e)
			{
				throw new DressNotFoundException();
			}
			
			Optional<Dress> optDress=Optional.of(dress);
			return optDress;
		
		

	}

	@Override
	public List<Dress> findByCategory(String category) {
		
		String sql="select * from dress where category=?";
		
		return jdbcTemplate.query(sql, new DressMapper(),category);
	}

	@Override
	public List<Dress> findByPriceLessThan(double price) {
		String sql="select * from dress where price<?";
		return jdbcTemplate.query(sql, new DressMapper(),price);
	}

	@Override
	public List<Dress> findByNameContaining(String name, String category) {
		String sql="select * from dress where category=? and name like ?";
		return jdbcTemplate.query(sql, new DressMapper(),category,"%"+name+"%");
	}

	@Override
	public List<Dress> findByBrandStarting(String brand) {
		String sql="select * from dress where brand like ?";
		return jdbcTemplate.query(sql, new DressMapper(),brand+"%");
	}

}
