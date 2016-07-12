<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="myTags" uri="WEB-INF/MyCustomTaglib.tld"%>    
<!DOCTYPE html>
<html>
	<head>
		<jsp:useBean id="photoAlbum" scope = "session" class="Part1_3.JSP_PhotoAlbum.PhotoAlbum"/>
		<jsp:setProperty name="photoAlbum" property="session" value="<%=session%>" />
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>JSP photo Album</title>
	
	</head>
	<body>
		<h3 align='center'> Photos ${photoAlbum.photoCount}</h3>

		<table>
			<tr>	
	        				
				<c:forEach var="i" begin="1" end="${photoAlbum.photoCount}">
						<td>
							<myTags:photo width="150" height="120" index="${i-1}"></myTags:photo>
					 	</td>	
			    </c:forEach>
					 				

				<td bgcolor='#cccccc' width='120' height='120'>
					<form action='UploadServlet' method='post' enctype='multipart/form-data'>
						<input value='Choose' name='myFile' type='file' accept='image/jpeg'><br>
						<input value='Upload' type='submit'><br>
					</form>
				</td>	
			</tr>
			<tr>
                <c:forEach var="item" items="${photoAlbum.names}">
                    <td align='center'>
                        ${item}
                    </td>
                </c:forEach>			
			</tr>				
			<tr>			
	 			<c:forEach var="i" begin="1" end="${photoAlbum.photoCount}">
					<td>
						<a href="RemovePhotoServlet?photo=${i-1}">remove</a>
					</td>
				</c:forEach> 					
           </tr>
		</table>
		
	</body>
</html>