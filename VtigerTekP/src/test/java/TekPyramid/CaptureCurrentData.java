package TekPyramid;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CaptureCurrentData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Date d=new Date(0);
	SimpleDateFormat sim=new SimpleDateFormat("YYYY-MM-DD");
	String actdate=sim.format(d);
	System.out.println(actdate+"current date");
	Calendar cal=sim.getCalendar();
	cal.add(Calendar.DAY_OF_MONTH,+30);
	String datereq=sim.format(cal.getTime());
	System.out.println(datereq+"after 30 days");
	}
	}
