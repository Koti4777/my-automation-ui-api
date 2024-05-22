package core.java.examples.qafox;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String filename = new SimpleDateFormat("yyy-MM-dd-hh-mm-ss").format(new Date());
		ExtentReports report = new ExtentReports();
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(System.getProperty("user.dir")+"\\extentreports\\"+filename+".html");
		report.attachReporter(htmlReport);
		System.out.println("came to end");
		ExtentTest test1 = report.createTest("test1");
		test1.pass("this is passed");
		report.flush();
	}

}
