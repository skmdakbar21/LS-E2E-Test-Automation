package stepdefs;

import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;

public class Commonstepdefs {
    
    WebDriver driver;
    
    public Commonstepdefs (Environments environments) throws Throwable {
        driver = environments.setUp();
    }
    
@Given("I go to my ToDo App")
public void I_go_to_my_todo_app() throws Throwable {
driver.get("http://crossbrowsertesting.github.io/todo-app.html");
}

@Given("I go to my {string} App")
public void I_go_to_my_todo_app_param(String env) throws Throwable {
driver.get("http://crossbrowsertesting.github.io/todo-app.html");
System.out.println("param passed is "+env);
int fact=1;
for(int i=5;i>0;i--)
    {
        fact=fact*i;
    }
System.out.println("Result is "+ fact);
}

}