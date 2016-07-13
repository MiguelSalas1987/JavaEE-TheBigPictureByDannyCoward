package Part1_3.JSP_PhotoAlbum;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name="RemovePhotoServlet", urlPatterns= "/RemovePhotoServlet")
public class RemovePhotoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException
	{
		String indexString = req.getParameter("photo");
		int    index = (new Integer(indexString.trim())).intValue();
		
		HttpSession session = req.getSession();
		PhotoAlbum photoAlbum = PhotoAlbum.getPhotoAlbum(session);
		photoAlbum.removePhoto(index);
		
		resp.sendRedirect("./PA_album.jsp");
	}
	

}
