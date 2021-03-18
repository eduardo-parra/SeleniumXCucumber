package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {


@Given("i have enterd {int} into the calculator")
public void i_have_enterd_into_the_calculator(Integer int1) {

        System.setProperty("webdriver.chrome.driver", "D:\\Eduardo\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php/");
        Thread.sleep(5000);  // Let the user actually see something!
        driver.switchTo().frame(0);
        driver.findElement(By.id("introAgreeButton")).click();
        Thread.sleep(5000);

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("VIKINGS!!!");
        searchBox.submit();
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();
    }


@Given("i have also enterd {int} into the calculator")
public void i_have_also_enterd_into_the_calculator(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }

@When("i press add")
public void i_press_add() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }

@Then("the result should be {int} on the screen")
public void the_result_should_be_on_the_screen(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
        }

}