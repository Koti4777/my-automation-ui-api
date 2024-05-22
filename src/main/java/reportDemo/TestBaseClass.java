package reportDemo;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * This class consists of operations that are supposed to be done before the test case suite begins
 */
public class TestBaseClass {

  @BeforeSuite
  public void beforeSuite() {
    ExtentManager.setExtent();
  }

  @AfterSuite
  public void afterSuite() {
    //service.shutdown();
    ExtentManager.endReport();
  }
}