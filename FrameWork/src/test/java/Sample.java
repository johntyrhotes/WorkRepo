import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("clean up");
		super.finalize();
	}
	
	private void m1() {
		System.out.println("m1 has an object");

	}

	public static void main(String[] args) {
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
		
		Sample a=new Sample();
		a.m1();
		a=null;
		System.gc();
		a.m1();

	}

}
