<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<div align="center">
	<h1>Edit Members</h1>
       <form:form method="POST" action="/Assignment4_Spring/editsaveMember">  
	      	<table>  
		      	<tr>
		      	<td></td>  
		           <td><form:hidden  path="memberId" /></td>
		         </tr> 
		         <tr>  
		            <td>Member Name : </td> 
		            <td><form:input path="memberName"  /></td>
		         </tr>  
		         <tr>  
		            <td>Member Date :</td>  
		            <td><form:input type="date" path="memberDate" /></td>
		         </tr> 
		         <tr>  
		            <td>Member Type :</td>  
		            <td><form:input path="member_type" /></td>
		         </tr> 
		         <tr>  
		            <td>Address :</td>  
		            <td><form:input path="address" /></td>
		         </tr> 
		         <tr>  
		            <td>Expiry Date :</td>  
		            <td><form:input type="date" path="expiry_date" /></td>
		         </tr> 
		         <tr>  
		            <td> </td>  
		            <td><input type="submit" value="Edit Save" /></td>  
		         </tr>  
	        </table>  
       </form:form>  
</div>       
       