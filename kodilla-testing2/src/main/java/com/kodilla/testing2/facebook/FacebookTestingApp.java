package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_DIV_DATE = "//span[@class=\"_5k_4\"]";
    public static final String XPATH_SELECT_DAY = "//span[@class=\"_5k_4\"]/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//span[@class=\"_5k_4\"]/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[@class=\"_5k_4\"]/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_DIV_DATE)).isDisplayed());

        WebElement selectCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(selectCombo);
        selectDay.selectByIndex(20);

        selectCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(selectCombo);
        selectMonth.selectByIndex(10);

        selectCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(selectCombo);
        selectYear.selectByValue("1991");
    }
}
