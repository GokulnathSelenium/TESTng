package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {
	WebDriver driver;
@Parameters({"email","pass"})
@Test(dataProvider="pasdata")
private void testone(String mail,String pass) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GokulnathUlaganathan\\eclipse-workspace\\SampleNG\\driver\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys(mail);
	WebElement txtpass = driver.findElement(By.id("pass"));
	txtpass.sendKeys(pass);
	driver.findElement(By.xpath("//button[text()='Log In']")).click();
}
@DataProvider(name="pasdata")
public Object[] [] data(){
	return new Object[] [] {
		{"abi","abipass123"},
		{"api","apipass123"}
	};
}
}
