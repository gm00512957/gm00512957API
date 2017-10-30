package org.controller;
import java.util.concurrent.TimeUnit;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

@RestController
public class HelloWorldRestController {
	private WebDriver driver;
	private String baseUrl;
	private String baseUrlDev;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
    @RequestMapping("/")
    public String welcome() {//Welcome page, non-rest
        return "Welcome to RestTemplate Example.";
    }
 
    @RequestMapping("/hello/{player}")
    public Message message(@PathVariable String player) {//REST Endpoint.
 
        Message msg = new Message(player, "Hello " + player);
        return msg;
    }
    HelloWorldRestController(){}
}