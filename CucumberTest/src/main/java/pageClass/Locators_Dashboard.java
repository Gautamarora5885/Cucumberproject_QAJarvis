package pageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators_Dashboard {
	WebDriver driver;
	By Dashboard = By.xpath("/html/body/div/div[3]/div[2]/div/section/section/div/section[1]/div[1]/ul/li[1]/a/span");
	By ViewProfile =By.cssSelector(".dropdown.user.user-menu > ul[role='menu'] > li:nth-of-type(1) > a");
	By Timezone = By.cssSelector("select#name");
	By Execution_progress_dropdown = By.xpath("/html/body/div[@class='fade-in-up ng-scope']/div[@class='ng-scope wrapper']//div[@class='content-wrapper ng-scope']/section[@class='ng-scope']/section[@class='ng-scope']//section[@class='content ng-scope']/div[1]/div[@class='col-md-12']/div[@class='box box-primary']/div[@class='box-header with-border']/div[@class='box-tools pull-right']/button[@class='btn btn-box-tool']/i[@class='fa fa-angle-down']");
	
	public Locators_Dashboard(WebDriver ref1)   
	{
		driver = ref1;	
	}	

public void Dashboard_Displayed()
{
	
	driver.findElement(Dashboard).isDisplayed();
}


public void View_profile()
{

driver.findElement(ViewProfile).click();
}


public void Timezone() throws InterruptedException
{

driver.findElement(Timezone).click();
Thread.sleep(2000);
Select drpTimezone = new Select(driver.findElement(Timezone));
drpTimezone.selectByVisibleText("(UTC+05:00) Islamabad, Karachi");

}
}