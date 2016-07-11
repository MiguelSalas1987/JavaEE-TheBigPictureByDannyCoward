package Part1_3.JSP_PhotoAlbum;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(description = "uploads the photos", urlPatterns = { "/UploadServer" })
public class UploadServlet extends HttpServlet {
 
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
    throws ServletException, IOException 
	{
		HttpSession session = req.getSession();
		PhotoAlbum photoAlbum = PhotoAlbum.getPhotoAlbum(session);
		if(req.getContentType() != null &&
		   req.getContentType().startsWith("multipart/form-data"))
		{
			this.uploadPhoto(req, photoAlbum);
		}	
	}

	private void uploadPhoto(HttpServletRequest req, PhotoAlbum photoAlbum)
	throws IOException, ServletException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		for(Part part:  req.getParts())
		{
			this.copyBytes(part.getInputStream(), byteArrayOutputStream);
		}	
	}

	private void copyBytes(InputStream inputStream, ByteArrayOutputStream byteArrayOutputStream)
	throws IOException
	{
		int index;
		
		while((index=inputStream.read()) != -1)
		{
			byteArrayOutputStream.write(index);
		}	
		
		inputStream          .close();
		byteArrayOutputStream.close();
	}

}
