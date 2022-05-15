<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<div align="center">
	<h1>Edit Books</h1>
       <form:form method="POST" action="/Assignment4_Spring/editsaveBook">  
	      	<table>  
		      	<tr>
		      	<td></td>  
		           <td><form:hidden  path="bookId" /></td>
		         </tr> 
		         <tr>  
		            <td>Title : </td> 
		            <td><form:input path="title"  /></td>
		         </tr>  
		         <tr>  
		            <td>Price :</td>  
		            <td><form:input path="price" /></td>
		         </tr> 
		         <tr>  
		            <td>Vendor :</td>  
		            <td><form:input path="author" /></td>
		         </tr> 
		         <tr>  
		            <td>Available :</td>  
		            <td><form:input path="available" /></td>
		         </tr> 
		         
		         <tr>  
		            <td> </td>  
		            <td><input type="submit" value="Edit Save" /></td>  
		         </tr>  
	        </table>  
       </form:form>  
</div>       
       