<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  

<div align="center">
	<h1>Add New Publisher</h1>
	<form:form method="post" action="savePub">  
		<table>  
			  <tr>  
			      <td>Publisher Id : </td> 
			      <td><form:input path="pubId"  /></td>
			  </tr>  
			  <tr>  
			     <td>Publisher Name :</td>  
			     <td><form:input path="pubName" /></td>
			  </tr> 
			  <tr>  
			     <td>Address :</td>  
			     <td><form:input path="address" /></td>
			  </tr> 
			  	  
			  <tr>  
			    <td> </td>  
			    <td><input type="submit" value="Save" /></td>
			 </tr>  
		</table>  
	</form:form>  
</div>