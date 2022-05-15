package com.ad.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.ad.beans.Book;
import com.ad.beans.Member;

public class MemberDao {
	
	JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {  
	    this.template = template;  
	}  
	
	public Member getMemberById(int id){  
	    String sql="select * from member where memberId=?";  
	    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Member>(Member.class));  
	}
	
	public int saveMember(Member m){  
	    String sql="insert into Member(memberId,memberName,memberDate,member_type,address,expiry_date) values("+m.getMemberId()+",'"+m.getMemberName()+"','"+m.getMemberDate()+"','"+m.getMember_type()+"','"+m.getAddress()+"','"+m.getExpiry_date()+"')";  
	    return template.update(sql);  
	}  
	
	public List<Member> getMembers(){  
	    return template.query("select * from member",new RowMapper<Member>(){  
	        public Member mapRow(ResultSet rs, int row) throws SQLException {  
	            Member e = new Member();  
	            e.setMemberId(rs.getInt(1));  
	            e.setMemberName(rs.getString(2));  
	            e.setMemberDate(rs.getString(3));  
	            e.setMember_type(rs.getString(4));
	            e.setAddress(rs.getString(5));
	            e.setExpiry_date(rs.getString(6));
	            return e;  
	        }  
	    });  	
	}
	
	public int updateMember(Member m){  
	    String sql="update member set memberName='"+m.getMemberName()+"', memberDate='"+m.getMemberDate()+"',member_type='"+m.getMember_type()+"',address='"+m.getAddress()+"',expiry_date='"+m.getExpiry_date()+"' where memberId="+m.getMemberId()+"";  
	    return template.update(sql);  
	}  
	
	public int deleteMember(int id){  
	    String sql="delete from member Where memberId="+id+"";  
	    return template.update(sql);  
	}  

	

}
