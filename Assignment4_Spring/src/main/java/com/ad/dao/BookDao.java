package com.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ad.beans.Book;

public class BookDao {

	JdbcTemplate template;  
	  
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public Book getBookById(int id){  
	    String sql="select * from Book where bookId=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Book>(Book.class));  
	}
	
	public int saveBook(Book b){  
	    String sql="insert into Book(BookId,title,price,author,available) values("+b.getBookId()+",'"+b.getTitle()+"','"+b.getPrice()+"','"+b.getAuthor()+"','"+b.getAvailable()+"')";  
	    return template.update(sql);  
	}  
	
	public List<Book> getBooks(){  
	    return template.query("select * from Book",new RowMapper<Book>(){  
	        public Book mapRow(ResultSet rs, int row) throws SQLException {  
	            Book e = new Book();  
	            e.setBookId(rs.getInt(1));  
	            e.setTitle(rs.getString(2));  
	            e.setPrice(rs.getFloat(3));  
	            e.setAuthor(rs.getString(4));
	            e.setAvailable(rs.getString(5));
	            return e;  
	        }  
	    });  	
	}
	
	public int updateBook(Book b){  
	    String sql="update Book set title='"+b.getTitle()+"', price="+b.getPrice()+",author='"+b.getAuthor()+"',available='"+b.getAvailable()+"' where bookId="+b.getBookId()+"";  
	    return template.update(sql);  
	}  
	
	public int deleteBook(int id){  
	    String sql="delete from Book Where bookId="+id+"";  
	    return template.update(sql);  
	}  


}	
	
