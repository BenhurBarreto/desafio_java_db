package br.com.db.desafio.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"br.com.db.desafio.StepDefinition", "br.com.db.desafio.utility"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"},
        dryRun = false
)
public class TestRunner {

}
