package sample;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class editlead {
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
		driver.findElement(By.linkText("create Leads")).click();
		driver.findElement(By.id("create LeadsForm_companyName")).sendKeys("ABC");
		driver.findElement(By.xpath("create LeadsForm_FirstName")).sendKeys("little");
		driver.findElement(By.xpath("create LeadsForm_lastName")).sendKeys("kan");
		Thread.sleep(5000);
		driver.findElement(By.xpath("FirstName"));
		driver.findElement(By.xpath("//div[@id=\"ext-gen501\"]")).sendKeys("little");
		Thread.sleep(5000);
		driver.findElement(By.id("department")).click();
		driver.findElement(By.id("department")).click();
		driver.findElement(By.id("state/province")).click();
		driver.findElement(By.xpath("//div[@id=\"ext-gen921\"]"));
		driver.findElement(By.id("email")).sendKeys("kanmani.8.it@gmail.com");
		driver.findElement(By.id("create Lead")).click();
		driver.findElement(By.id("Edit Button")).click();
		driver.findElement(By.id("Fill the mportant feild with any text"));
		driver.findElement(By.className("update button")).click();
		String title = driver.getTitle();
		System.out.println("title of the resulting page :"+title);
		driver.close();

	}
}



//WebElement firstname =driver.findElement(By.id("FirstName"));
//Select select = new Select(firstname);
//select.select ByVisibleText("kan");

//WebElement sp =driver.findElement(By.id("state/province"));
//Select opt = new Select(sp);
//opt.select ByVisibleText("NewYork");
//driver.findElement(By.xpath("//div[@id=\"ext-gen921\"]"));
