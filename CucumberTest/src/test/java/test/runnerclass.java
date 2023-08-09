package test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",glue= {"test"},

monochrome=true,
plugin= {"pretty","junit:target/junit/junitreport/report.xml"},
tags= "@P1")
public class runnerclass {

}
