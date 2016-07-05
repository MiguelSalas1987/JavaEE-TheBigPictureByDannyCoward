package Part1_3;
import java.util.Date;
import java.text.SimpleDateFormat;
public class ClockBean {
	
	public long getCurrentTimeSinceEpoch()
	{
		return System.currentTimeMillis();
	}
	
	public String getReadableDate()
	{
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("EEEEEEEE");
		String today =   sdf.format(now);
		return today;
	}

}
