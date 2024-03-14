package Selenium_Karthik;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoneyControl {

	 public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
//Accessing Moneycontrol Application
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsemact1/index.php");

		driver.manage().timeouts().getPageLoadTimeout();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		driver.manage().timeouts().getPageLoadTimeout();
		List<WebElement> stocklist = driver
				.findElements(By.xpath("//div[@class='bsr_table hist_tbl_hm']/table/tbody/tr"));
		System.out.println("Top 5 Stock list:\n");

		for (int i = 0; i < 5; i++) {
			
			System.out.println(stocklist.get(i).getText());
		}
		driver.quit();
	}

}
