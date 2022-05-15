package com.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ad.beans.Book;
import com.ad.beans.Pub;

public class PubDao {

	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public Pub getPubById(int id){  
	    String sql="select * from publisher where pubId=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Pub>(Pub.class));  
	}

	public int savePub(Pub p){  
	    String sql="insert into publisher(pubId,pubName,address) values("+p.getPubId()+",'"+p.getPubName()+"','"+p.getAddress()+"')";  
	    return template.update(sql);  
	}  
	
	public List<Pub> getPubs(){  
	    return template.query("select * from publisher",new RowMapper<Pub>(){  
	        public Pub mapRow(ResultSet rs, int row) throws SQLException {  
	            Pub e = new Pub();  
	            e.setPubId(rs.getInt(1));  
	            e.setPubName(rs.getString(2));  
	            e.setAddress(rs.getString(3));
	            return e;  
	        }  
	    });  	
	}

	public int updatePub(Pub p){  
	    String sql="update publisher set pubName='"+p.getPubName()+"', address='"+p.getAddress()+"' where pubId = " + p.getPubId()+"";  
	    return template.update(sql);  
	}  
	
	public int deletePub(int id){  
	    String sql="Delete From publisher Where pubId="+id+"";  
	    return template.update(sql);  
	}  
		
	
}
