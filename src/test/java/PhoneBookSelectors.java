import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookSelectors {

    WebDriver driver = new ChromeDriver();


    @Test
    public void PhoneBookTest() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        pause(3);
        WebElement btnHome = driver.findElement(By.cssSelector("a[aria-current='page']"));
        btnHome.click();
        WebElement btnAbout = driver.findElement(By.cssSelector("a[href='/about']"));
        btnAbout.click();
        WebElement div = driver.findElement(By.cssSelector("div[class='about_main__2Uv5W']"));
        String divText = div.getText();
        System.out.println(divText);
        WebElement h1 = driver.findElement(By.cssSelector("div[class='about_main__2Uv5W']>h1"));
        System.out.println("h1-->" + h1.getText());
        pause(3);
        WebElement btnLogin = driver.findElement(By.cssSelector("div[class='navbar-component_nav__1X_4m'] a:nth-child(4)"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.cssSelector("*[name='email']"));
        inputEmail.sendKeys("genahsvili81@gmail.com");
        WebElement inputPassword = driver.findElement(By.cssSelector("input[placeholder='Password']"));
        inputPassword.sendKeys("Asd22zxc88$");
        WebElement btnLoginForm = driver.findElement(By.cssSelector("button[name='login']"));
        btnLoginForm.click();
        pause(3);
        driver.quit();
    }

    public static void pause(int time) {
        try {
            Thread.sleep(time * 1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
