package list;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver  = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.ajio.com/");
		
		
	driver.findElement(By.name("searchVal")).sendKeys("bags");
    driver.findElement(By.xpath("//span[@class='ic-search']")).click();
    
    Thread.sleep(3000);
    driver.findElement(By.xpath("//label[@for='Men']")).click();
    
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("//label[@for ='Men - Fashion Bags']")).click();
    
    Thread.sleep(3000);
    
    WebElement totalItemsElement = driver.findElement(By.className("length"));

    String totalItems = totalItemsElement.getText();
    
    System.out.println(totalItems);
    
    List<WebElement> brandElements = driver.findElements(By.className("brand"));
    
    System.out.println("Brands:");
    
    for (WebElement brandElement : brandElements) {
        System.out.println(brandElement.getText());
    }

  
    List<WebElement> nameElements = driver.findElements(By.className("nameCls"));
    
    System.out.println("Bag Names:");
    
    for (WebElement nameElement : nameElements) {
        System.out.println(nameElement.getText());
    }
    
		  
		


	}

}
