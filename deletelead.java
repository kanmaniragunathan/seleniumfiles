package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class deletelead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find")).click();
		driver.findElement(By.linkText("phone tab")).sendKeys("9962991234");
		driver.findElement(By.linkText("Find leads")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("delet lead")).click();
		driver.findElement(By.id("Find Lead")).click();
		String title = driver.getTitle();
		System.out.println("no record to display:"+title);
		driver.close();

	}
}



