import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstClass {
    WebDriver wd;

    @Test
    public void  preCondition(){
        WebDriverManager.chromedriver().setup();
        wd = new ChromeDriver();
//        wd.get("");
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/home");
//        wd.navigate().forward();
//        wd.navigate().back();
//        wd.navigate().refresh();
    }

}
