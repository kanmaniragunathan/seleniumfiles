package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class teaftapcreate {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Account")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("account name")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.id("Enter Number of Employees	")).sendKeys("little");
		driver.findElement(By.linkText("Enter Site Name")).sendKeys("leaftap");
		driver.findElement(By.id("create Account")).click();
		@SuppressWarnings("unused")
		String title = driver.getTitle();
		System.out.println("Tile is display correctly");
		driver.close();
		
		}

	}


