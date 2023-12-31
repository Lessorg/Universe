package com.fluffy.universe.ui;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class RegistrationSeleniumTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {

    System.setProperty("webdriver.http.factory", "jdk-http-client");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ооо\\AppData\\Roaming\\npm\\node_modules\\chromedriver\\lib\\chromedriver\\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
    options.setBinary("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Google Chrome.exe");
    options.addArguments("--remote-allow-origins=*");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void registrationtest() {
    driver.get("http://127.0.0.1:7000/");
    driver.manage().window().setSize(new Dimension(787, 824));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.linkText("Sign up")).click();
    driver.findElement(By.id("sign-up__first-name")).click();
    driver.findElement(By.id("sign-up__first-name")).sendKeys("sgsgs");
    driver.findElement(By.id("sign-up__last-name")).click();
    driver.findElement(By.id("sign-up__last-name")).sendKeys("agagagge");
    driver.findElement(By.id("sign-up__email")).click();
    driver.findElement(By.id("sign-up__email")).sendKeys("collya.reznick@gmail.com");
    driver.findElement(By.id("sign-up__password")).click();
    driver.findElement(By.id("sign-up__password")).sendKeys("YUYUYUYUY");
    driver.findElement(By.id("sign-up__confirm-password")).click();
    driver.findElement(By.id("sign-up__password")).click();
    driver.findElement(By.id("sign-up__password")).click();
    {
      WebElement element = driver.findElement(By.id("sign-up__password"));
      Actions builder = new Actions(driver);
      builder.doubleClick(element).perform();
    }
    driver.findElement(By.id("sign-up__password")).sendKeys("Testpasswd#2014");
    driver.findElement(By.id("sign-up__confirm-password")).click();
    driver.findElement(By.id("sign-up__confirm-password")).sendKeys("Testpasswd#2014");
    driver.findElement(By.cssSelector(".form__button")).click();
    driver.findElement(By.cssSelector(".alert__button")).click();
  }
}
