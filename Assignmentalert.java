package HandsOn;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignmentalert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		String text =driver.findElement(By.id("simple_result")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		alert.dismiss();
		String text2 = driver.findElement(By.id("result")).getText();
		System.out.println(text2);
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[1]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Nandhini");
		alert.accept();
		String str = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(str);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		
		driver.close();
}
}
