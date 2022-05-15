<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<div align="center">
	<h1>Books List</h1>
	<table border="3" width="70%" cellpadding="3">
		<tr><th>ProductId</th><th>TITLE</th><th>PRICE</th><th>vendor</th><th>AVAILABLE</th><th>Edit</th><th>Delete</th></tr>
	    <c:forEach var="book" items="${list}"> 
			  <tr>
				   <td>${book.bookId}</td>
				   <td>${book.title}</td>
				   <td>${book.price}</td>
				   <td>${book.author}</td>
				   <td>${book.available}</td>
				   
				   <td><a href="editbook/${book.bookId}">Edit</a></td>
				   <td><a href="deletebook/${book.bookId}">Delete</a></td>
			  </tr>
		 </c:forEach>
	</table>
	<br/>
	<a href="bookform">Add New Product</a>
</div>

