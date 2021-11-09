package mytestpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
WebDriver driver;
Login(WebDriver driver){
    this.driver =driver;
}
    public void Log()

    {
        this.driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        this.driver.findElement(By.name("txtPassword")).sendKeys(("admin123"));
 this.driver.findElement(By.className("button")).click();
    }
    public void Logout() throws InterruptedException {
      this.driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
        Thread.sleep(2000);
this.driver.findElement(By.linkText("Logout")).click();

    }

}
