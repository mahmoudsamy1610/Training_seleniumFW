package Utilities;


import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class Helper {

	//method of taking screen shots to be implemented in another class
	
	public static void takeScreenShot (WebDriver driver , String ShotName) throws IOException {
		
		// defining screen shot path by getting the path from user project
			Path dest = Paths.get("./Screenshots", ShotName+".png") ;
			
			
		//because the "dest" value is the destination to the file , we will get the parent folder to use it
			Files.createDirectories(dest.getParent()) ;
			
		//out is new object from output stream class , and will save the screenshot to [dest]
			FileOutputStream out = new FileOutputStream(dest.toString()) ;
			
		//the command of taking screenshot and defining the output type
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)) ;
				
	}
	
	
}
