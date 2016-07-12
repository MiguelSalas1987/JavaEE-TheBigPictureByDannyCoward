package Part1_3.JSP_PhotoAlbum;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet(name = "UploadServlet", urlPatterns = { "/UploadServlet" })
@MultipartConfig()
public class UploadServlet extends HttpServlet {


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
		res.sendRedirect("./PA_album.jsp");
	}

	private void uploadPhoto(HttpServletRequest req, PhotoAlbum photoAlbum)
	throws IOException, ServletException
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		String filename = null;
		
		for(Part part:  req.getParts())
		{
			this.copyBytes(part.getInputStream(), byteArrayOutputStream);
			filename = part.getSubmittedFileName();
		}
		
		if (!"".equals(filename))
		{
			String photoName = filename.substring(0, filename.lastIndexOf("."));
			photoAlbum.addPhoto(photoName, byteArrayOutputStream.toByteArray());
		}	
		
	}

	private void copyBytes(InputStream inputStream, OutputStream outputStream)
	throws IOException
	{
		int index;
		
		while((index=inputStream.read()) != -1)
		{
			outputStream.write(index);
		}	
		
		inputStream .close();
		outputStream.close();
	}

}
