package commonLibraries;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot 
{
	public static String getscreenshot(WebDriver driver, String name) throws IOException 
	{
	/*	DateFormat dateFormat = new SimpleDateFormat("MM/DD/YYYY HH:MM:SS");
		java.util.Date date = new java.util.Date();
		String GetDate = dateFormat.format(date);*/
		File srcfile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String destfile= System.getProperty("user.dir")+"/Screenshots/"+name+".png";
		File finaldest = new File(destfile) ;
		FileUtils.copyFile(srcfile,finaldest);

		return destfile;
	}
}
