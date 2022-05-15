<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<div align="center">
	<h1>Publishers List</h1>
	<table border="3" width="70%" cellpadding="3">
		<tr><th>Publisher Id</th><th>Publishers Name</th><th>Address</th><th>Edit</th><th>Delete</th></tr>
	    <c:forEach var="pub" items="${list}"> 
			  <tr>
				   <td>${pub.pubId}</td>
				   <td>${pub.pubName}</td>
				   <td>${pub.address}</td>
				   
				   <td><a href="editpub/${pub.pubId}">Edit</a></td>
				   <td><a href="deletepub/${pub.pubId}">Delete</a></td>
			  </tr>
		 </c:forEach>
	</table>
	<br/>
	<a href="pubform">Add New Publisher</a>
</div>

