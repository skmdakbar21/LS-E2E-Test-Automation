package stepdefs;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import java.util.List;
import org.openqa.selenium.WebDriver;

public class basestepdefs {
    
    WebDriver driver;
    
    public basestepdefs (Environments environments) throws Throwable {
        driver = environments.setUp();
    }
    
@When("I archive all todos")
public void I_archive_all_todos() throws Throwable {
driver.findElement(By.name("todo-1")).click();
driver.findElement(By.name("todo-2")).click();
driver.findElement(By.name("todo-3")).click();
driver.findElement(By.name("todo-4")).click();
driver.findElement(By.name("todo-5")).click();
driver.findElement(By.linkText("archive")).click();
}


@Then("I should have no todos")
public void I_should_have_no_todos() throws Throwable {
List elems = driver.findElements(By.className("done-true"));
assertEquals(0, elems.size());
}

}