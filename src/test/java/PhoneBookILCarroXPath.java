import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class PhoneBookILCarroXPath {

    WebDriver driver = new ChromeDriver();

    @Test

    public void xpathTest() {
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement div = driver.findElement(By.xpath("//div[@id='root']"));
        System.out.println(div.getText());
        WebElement btnAbout = driver.findElement(By.xpath("//a[text()='ABOUT']"));
        String str = btnAbout.getAttribute("href");
        System.out.println(str);
        System.out.println("################################");
        WebElement btnLogin = driver.findElement(By.xpath("//a[@href='/login']"));
        btnLogin.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.sendKeys("genahsvili81@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//*[@name='password']"));
        inputPassword.sendKeys("Asd22zxc88$");
        WebElement btnRegistration = driver.findElement(By.xpath("//*[text()='Registration']"));
        btnRegistration.click();
        driver.quit();
    }

    @Test
    public void ilCarroXpath() {
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnSingUp = driver.findElement(By.xpath("//a[text()=' Sign up ']"));
        btnSingUp.click();
        WebElement inputName = driver.findElement(By.xpath("//input[@id='name']"));
        inputName .sendKeys("Nataly");
        WebElement inputLastName = driver.findElement(By.xpath("//input[@formcontrolname='lastName']"));
       inputLastName .sendKeys("Gena");
        WebElement inputEmail = driver.findElement(By.xpath("//form/div[3]/input"));
        inputEmail .sendKeys("genahsvili81@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//form/div[4]/input"));
       inputPassword .sendKeys("Asd22zxc88$");
       WebElement checkBox = driver.findElement(By.xpath("//label[@for='terms-of-use']"));
      checkBox.click();
     //   WebElement btnYalla= driver.findElement(By.xpath("//button[@type='submit']"));
     //   btnYalla.click();
    }
    @Test
    public void loginPhoneBookPositiveTest(){
        driver.get("https://telranedu.web.app/home");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLoginHeader =driver.findElement(By.xpath("//a[text()='LOGIN']"));
        btnLoginHeader.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys("genahsvili81@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//*[@placeholder='Password']"));
        inputPassword.sendKeys("Asd22zxc88$");
        WebElement btnLoginForm = driver.findElement(By.xpath("//form/button[1]"));
        btnLoginForm.click();
        driver.quit();
       // driver.close();
    }
    @Test
    public void loginCarroPositiveTest(){
        driver.get("https://ilcarro.web.app/search");
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement btnLoginHeader =driver.findElement(By.xpath("//a[text()=' Log in ']"));
        btnLoginHeader.click();
        WebElement inputEmail = driver.findElement(By.xpath("//input[@id='email']"));
        WebElement inputEmail_1 =driver.findElement(By.id("email"));
        inputEmail.sendKeys("genahsvili81@gmail.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@autocomplete='current-password']"));
        inputPassword.sendKeys("Asd22zxc88$");
        WebElement btnLoginForm = driver.findElement(By.xpath("//form/button"));
        btnLoginForm.click();
        driver.close();


    }

}
