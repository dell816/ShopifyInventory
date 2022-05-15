<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<div align="center">
	<h1>Edit Publishers</h1>
       <form:form method="POST" action="/Assignment4_Spring/editsavePub">  
	      	<table>  
		      	<tr>
		      	<td></td>  
		           <td><form:hidden  path="pubId" /></td>
		         </tr> 
		         <tr>  
		            <td>Publisher Name : </td> 
		            <td><form:input path="pubName"  /></td>
		         </tr>  
		         <tr>  
		            <td>Address :</td>  
		            <td><form:input path="address" /></td>
		         </tr> 
		         
		         <tr>  
		            <td> </td>  
		            <td><input type="submit" value="Edit Save" /></td>  
		         </tr>  
	        </table>  
       </form:form>  
</div>       
       