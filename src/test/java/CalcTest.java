import junit.framework.Assert;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class CalcTest {

    private static WebDriver driver;

    @BeforeClass
    public static void start()
    {
        File file = new File("D:/uni/Java/diver/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.get("D:/uni/Java/selenium-test/cal/calc.html");
    }

    @Before
    public void cleanup()
    {
        driver.findElement(By.xpath("//input[@value='C']")).click();
    }

    @Test
    public void AddTest()
    {
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.xpath("//input[@value='+']")).click();
        driver.findElement(By.xpath("//input[@value='9']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        //Assert.assertEquals("102",driver.findElement(By.id("resultbox")).getAttribute("value"));
        org.junit.Assert.assertEquals("102",driver.findElement(By.id("resulstbox")).getAttribute("value"));
    }

    @Test
    public void SubTest()
    {
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.xpath("//input[@value='-']")).click();
        driver.findElement(By.xpath("//input[@value='9']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        //Assert.assertEquals("102",driver.findElement(By.id("resultbox")).getAttribute("value"));
        org.junit.Assert.assertEquals("-82",driver.findElement(By.id("resulstbox")).getAttribute("value"));
    }

    @Test
    public void MultTest()
    {
        driver.findElement(By.xpath("//input[@value='5']")).click();
        driver.findElement(By.xpath("//input[@value='*']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        //Assert.assertEquals("102",driver.findElement(By.id("resultbox")).getAttribute("value"));
        org.junit.Assert.assertEquals("10",driver.findElement(By.id("resulstbox")).getAttribute("value"));
    }

    @Test
    public void DivTest()
    {
        driver.findElement(By.xpath("//input[@value='1']")).click();
        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.xpath("//input[@value='/']")).click();
        driver.findElement(By.xpath("//input[@value='2']")).click();
        driver.findElement(By.xpath("//input[@value='=']")).click();
        //Assert.assertEquals("102",driver.findElement(By.id("resultbox")).getAttribute("value"));
        org.junit.Assert.assertEquals("5",driver.findElement(By.id("resulstbox")).getAttribute("value"));
    }
    @AfterClass
    public static void stop ()
    {
        driver.quit();
    }
}
