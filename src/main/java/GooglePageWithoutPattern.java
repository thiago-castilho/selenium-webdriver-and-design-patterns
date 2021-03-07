import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePageWithoutPattern {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Selenium");
        espera();
        driver.findElement(By.xpath("//ul[@class='erkvQe']/li[3]//div[@class='sbl1']/span")).click();
        espera();
        driver.findElement(By.name("q")).clear();
        driver.findElement(By.name("q")).sendKeys("Selenium webdriver");
        espera();
        driver.findElement(By.xpath("//ul[@class='erkvQe']/li[3]//div[@class='sbl1']/span")).click();
        espera();
        driver.findElement(By.xpath("//a[text()='Notícias']")).click();
        espera();
        driver.findElement(By.xpath("//a[text()='Vídeos']")).click();
        espera();
        driver.findElement(By.xpath("//a[text()='Imagens']")).click();
        espera();
        driver.close();
        driver.quit();

    }

    public static void espera(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
