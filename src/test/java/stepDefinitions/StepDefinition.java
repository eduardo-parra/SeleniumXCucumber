package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.html.HTMLInputElement;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class StepDefinition {
private  WebDriver driver;
        @Given("i have loogd in to calculator page")
        public void i_have_loogd_in_to_calculator_page() {

                System.setProperty("webdriver.chrome.driver", "D:\\Eduardo\\Selenium\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php/");

        }


@Given("i have enterd {int} into the calculator")
public void i_have_enterd_into_the_calculator(Integer int1) throws InterruptedException {

        //System.setProperty("webdriver.chrome.driver", "D:\\Eduardo\\Selenium\\chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get("https://www.marshu.com/articles/calculate-addition-calculator-add-two-numbers.php/");
        //sleep(5000);  // Let the user actually see something!
        WebElement firstNumber = driver.findElement(By.name("n01"));
        firstNumber.sendKeys("50");

        sleep(5000);  // Let the user actually see something!
        //driver.quit();
    }


@Given("i have also enterd {int} into the calculator")
public void i_have_also_enterd_into_the_calculator(Integer int2) {
        WebElement firstNumber = driver.findElement(By.name("n02"));
        firstNumber.sendKeys("70");

        }

@When("i press add")
public void i_press_add() {
       driver.findElement(By.xpath("/html/body/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/form/p[4]/input")).click();


        }


@Then("the result should be {int} on the screen")
public void the_result_should_be_on_the_screen(Integer int1) {

        assertEquals("120", driver.findElement(By.name("answer")).getAttribute("value"));

        }

}