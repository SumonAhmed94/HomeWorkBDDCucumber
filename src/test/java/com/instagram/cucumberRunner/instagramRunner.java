package com.instagram.cucumberRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin= {"pretty", "html:target/instagramReport.html"},
		features="src/test/resources/features",
		glue="com.instargam.stepDefinations",
		tags="@Smoke",
		snippets=SnippetType.CAMELCASE	
		)

public class instagramRunner {

}
