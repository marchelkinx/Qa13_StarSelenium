import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class HTML_Test {

    WebDriver wd;

    @BeforeMethod
    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
        wd.get("file:///C:/Tools/index.html");

    }

    @Test
    public void HTML_t() {
        WebElement element = wd.findElement(By.xpath("//a[text()='Item 1']"));
        element.click();
        String elementText = element.getText(); // Item1

        WebElement container = wd.findElement(By.cssSelector("#alert p"));
        String message = container.getText(); // Clicked by Item1

        if (message.contains(elementText)) {
            System.out.println(":)))");
        } else
            System.out.println(":(((");

        Assert.assertTrue(message.contains(elementText));
        Assert.assertEquals(message,"Clicked by Item 1");

    }



    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

    }