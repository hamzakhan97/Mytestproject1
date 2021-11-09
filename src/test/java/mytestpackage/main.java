package mytestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class main {

    public static void main(String[] arg) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\hamza\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/");
        Login LG = new Login(driver);
LG.Log();
String text = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/h1")).getText();
if(text.contains( "Dashboard")) {
    System.out.println("Failed");
}
LG.Logout();

driver.navigate().refresh();
String title = driver.getTitle();
System.out.println(title);
String Url = driver.getCurrentUrl();
System.out.println(Url);
driver.quit();
    }


}
