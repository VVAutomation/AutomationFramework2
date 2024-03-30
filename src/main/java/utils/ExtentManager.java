package utils;

import java.io.File;
import java.util.Date;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentManager {

	public static ExtentReports extent;
	

	public static ExtentReports getInstance() {
		//Sat Mar 30 21:12:23 IST 2024.html =>_
		Date d = new Date();
		String name="Google Automation Team";
		
		String extentName=d.toString().replace(" ", "_").replace(":", "_");
		extentName=name+extentName;
		if (extent == null) {
		//	extent = new ExtentReports("./target/surefire-reports/html/extent.html", true, DisplayOrder.OLDEST_FIRST);
			extent = new ExtentReports("./ExtentReports/"+extentName+".html", true, DisplayOrder.OLDEST_FIRST);
			
			extent.loadConfig(new File("./src/test/resources/extent/extent-config.xml"));
		}
		return extent;
	}

}
