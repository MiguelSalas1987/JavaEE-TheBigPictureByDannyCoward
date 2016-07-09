package Part1_3.JSP_PhotoAlbum;
import java.util.*;
import javax.servlet.http.HttpSession;
public class PhotoAlbum {
	public static String ATTR_NAME = "PhotoAlbum";
	private List<byte[]> photos= new ArrayList<byte[]>();
	private List<String> names = new ArrayList<String>();
	
	public PhotoAlbum()
	{}
	
	public void setSession(HttpSession session)
	{
		session.setAttribute(ATTR_NAME, this);
	}
	
	public List<String> getNames()
	{
		return names;
	}
	
	public void addPhoto(String name, byte[] photo)
	{
		this.photos.add(photo);
		this.names.add (name);
	}
	
	public byte[] getPhoto(int index)
	{
		return (byte[]) photos.get(index);
	}
	
	public String getName(int index)
	{
		return (String) names.get(index);
	}
	
	public int getPhotoCount()
	{
		return photos.size();
	}
	
	public void removePhoto(int index)
	{
		names.remove (index);
		photos.remove(index);
	}
	public static PhotoAlbum getPhotoAlbum(HttpSession session)
	{
		return (PhotoAlbum) session.getAttribute(ATTR_NAME);
	}
}
