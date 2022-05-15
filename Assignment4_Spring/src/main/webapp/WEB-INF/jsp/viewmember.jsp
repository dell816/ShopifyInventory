<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<div align="center">
	<h1>Member List</h1>
	<table border="3" width="70%" cellpadding="3">
		<tr><th>MemberId</th><th>Member Name</th><th>Member Date</th><th>Member Type</th><th>Address</th><th>Expiry Date</th><th>Edit</th><th>Delete</th></tr>
	    <c:forEach var="member" items="${list}"> 
			  <tr>
				   <td>${member.memberId}</td>
				   <td>${member.memberName}</td>
				   <td>${member.memberDate}</td>
				   <td>${member.member_type}</td>
				   <td>${member.address}</td>
				   <td>${member.expiry_date}</td>
				   
				   <td><a href="editmember/${member.memberId}">Edit</a></td>
				   <td><a href="deletemember/${member.memberId}">Delete</a></td>
			  </tr>
		 </c:forEach>
	</table>
	<br/>
	<a href="memberform">Add New Member</a>
</div>

