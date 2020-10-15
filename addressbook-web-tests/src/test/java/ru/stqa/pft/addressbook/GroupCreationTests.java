package ru.stqa.pft.addressbook;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class GroupCreationTests {

    @Before
    public void signUp() {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("http://localhost/addressbook/group.php");
    }

    @Test


    public void testGroupCreation() {
        //input[@name='user']
//        String text = selenium.getText( "xpath=(//input[@type='checkbox'])
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://localhost/addressbook/group.php");
        driver.findElement(By.name("user")).sendKeys("admin");
        driver.findElement(By.name("pass")).sendKeys("secret");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        driver.findElement(By.linkText("groups")).click();




    }



}
