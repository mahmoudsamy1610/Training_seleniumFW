package runner;


import Tests.TestBase;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(
		features ={"D:\\Eclipse_rpojects\\MyTAF\\src\\test\\resources\\UserReg.feature"},
		glue = {"definitions"},
		plugin = {"pretty","html:target/html2.html"}
				)
public class TestRunner extends TestBase {

	
}
