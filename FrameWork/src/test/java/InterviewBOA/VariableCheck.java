package InterviewBOA;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VariableCheck {

	public static void main(String[] args) throws IOException {
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		File f=new File("D:\\test.txt");
		FileUtils.write(f,"Hello Johnty");
		FileUtils.write(f,"Hello Bhuvanesh",false);
		FileUtils.write(f,"Hello Naresh",true);
		List<String> readLines = FileUtils.readLines(f);
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(Exception.class);

		
	
	}

}
