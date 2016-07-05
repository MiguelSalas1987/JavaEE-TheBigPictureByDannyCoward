package Part1_3;
import java.util.Date;
import java.text.SimpleDateFormat;
public class ConfigurableClockBean {
	
	String DateFormat = "EEEEEEEE";
	
	public long getCurrentTimeSinceEpoch()
	{
		return System.currentTimeMillis();
	}
	
	public void setDateFormat(String dateFormat)
	{
		this.DateFormat = dateFormat;
	}
	
	public String getReadableDate()
	{
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat(DateFormat);
		String today =   sdf.format(now);
		return today;
	}

}
