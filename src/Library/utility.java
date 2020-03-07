package Library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class utility {
	
	public static void Screenshot(WebDriver driver,String screenshotname)
	{
		try
		{
			
		
		TakesScreenshot ts =(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source,new File(System.getProperty("user.dir")+"/Screenshots/"+screenshotname+".png"));
		System.out.println("screenshot taken as");
		}
		catch(Exception e)
		{
			System.out.println("Exception while taking screen shot "+e.getMessage());
		}
	}
	
	

}
