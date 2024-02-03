package Stepdef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\LENOVO\\eclipse-workspace\\Demo_Techshop_testNG\\src\\test\\resources\\Feature"
,glue = "Stepdef",plugin = "html:target/cucumber.html")

public class TestRunner {


}
