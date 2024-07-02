package com.mycompany.automation.pages.operations;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.mycompany.utils.Driver;

public class CommonOperations {
	WebDriver driver;
	public CommonOperations() {
		this.driver= Driver.getInstance();
	}
	public String takeScreenShot() throws IOException {
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");
		long currentTime = System.currentTimeMillis();
		String fileName = format.format(currentTime);
		String destinationPath = System.getProperty("user.dir")+"//outputs//"+fileName+".png";
		File destination = new File(destinationPath);
		FileUtils.copyFile(screenshotFile,destination);
		return destinationPath;
	}
}
