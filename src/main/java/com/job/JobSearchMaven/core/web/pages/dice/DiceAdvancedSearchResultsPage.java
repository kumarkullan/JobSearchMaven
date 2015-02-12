package com.job.JobSearchMaven.core.web.pages.dice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.job.JobSearchMaven.core.web.WebPage;
import com.job.JobSearchMaven.core.web.elements.Link;

public class DiceAdvancedSearchResultsPage extends WebPage<DiceAdvancedSearchResultsPage>{
	
	private static final String PAGE_URL = BASE_URL + "/jobs/advancedResult.html";

	public DiceAdvancedSearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	@Override
	public DiceAdvancedSearchResultsPage load() {
		driver.get(PAGE_URL);
		return this;
	}

	@Override
	public boolean isAvailable() {
		return 	getCreateJobAlertLink().isAvailable();
	}
	
	
	private Link getCreateJobAlertLink(){
		return new Link(driver, By.xpath("//a[@class='btn dice-btn-secondary job-alert pull-right']"));
	}
	
}
