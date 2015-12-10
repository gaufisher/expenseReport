package com.outhreeit.quickrbooks.SeleniumFramework.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by gfisher on 12/9/2015.
 */

/**
 * Use this class when writing Selenium Tests involving expense Reports.
 */
public class ExpenseReportPage extends HomePage{
    public ExpenseReportPage(WebDriver driver) {
        super(driver);
        WebElement create = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Create")));
        create.click();
        WebElement expenseReport = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.linkText("Expense Report")));
        expenseReport.click();
    }
}
