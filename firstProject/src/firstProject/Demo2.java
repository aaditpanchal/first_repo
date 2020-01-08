package firstProject;


import java.time.LocalDate;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Demo2 {
	
	WebDriver driver;

	@Before
	public void before() {
		String driverPath = "/Users/aaditpanchal/Downloads/";
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
		driver = new ChromeDriver();
		driver.get("https://myhms4.com/logoff.do?mykey=7046");
	}
	
	@Test
	public void test() {
		String datetoSend = "";
		LocalDate today = LocalDate.now().minusDays(1);
		datetoSend+= today.getMonthValue() + "/" + today.getDayOfMonth() + "/" + today.getYear();

		driver.findElement(By.name("username")).sendKeys("sanjay");
		driver.findElement(By.name("password")).sendKeys("omega8");
		driver.findElement(By.name("loginSubmit")).click();
		
		driver.findElement(By.xpath("/html/body/div[6]/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/nav/ul/li[3]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"headerMenu\"]/nav/ul/li[3]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"bodyTable\"]/tbody/tr/td/table/tbody/tr[2]/td[1]/table/tbody/tr[4]/td/a")).click();
		driver.findElement(By.xpath("//*[@id=\"jreport\"]/table/tbody/tr[2]/td[2]/input")).clear();
		driver.findElement(By.xpath("//*[@id=\"jreport\"]/table/tbody/tr[2]/td[2]/input")).sendKeys(datetoSend);
		driver.findElement(By.xpath("//*[@id=\"reportbutton\"]")).click();
		
		//		Assert.assertTrue(driver.getTitle().contains("Facebook"));
	}
	

	
	
	
	
	
//	@After
//	public void after() {
//		driver.close();
//		driver.quit();
//	}

}
