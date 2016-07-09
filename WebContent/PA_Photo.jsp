<%@page contentType="image/jpeg"%>
<%@page import="Part1_3.JSP_PhotoAlbum.PhotoAlbum" %>>    
<%
	java.io.OutputStream binaryOut = response.getOutputStream();
	String indexString = request.getParameter("photo");
	int index = (new Integer(indexString.trim())).intValue();
	PhotoAlbum photoAlbum = PhotoAlbum.getPhotoAlbum(session);
	byte[] bytes = photoAlbum.getPhoto(index);
	
	for(int i = 0; i < bytes.length; i++)
	{
		binaryOut.write(bytes[i]);
	}	
%>>