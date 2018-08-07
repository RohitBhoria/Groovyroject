package org

import org.openqa.selenium.chrome.ChromeDriver

import geb.Browser
import geb.spock.GebSpec
import spock.lang.Specification

class LoginTestCase extends Specification{

	def browser = new Browser()
	
	
	def "successful login"(){
		given: "The user is on login page"
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohit.bhoria\\Documents\\NDCTF\\Setup\\chromedriver_win32\\chromedriver.exe")
		browser.driver = new ChromeDriver()
		browser.go("http://www.newtours.demoaut.com/")
		
		when:"user enters correct credentials"
		LoginPageObjects.name.value("username1")
		LoginPageObjects.password.value("password1")
		LoginPageObjects.loginButton.click()
		
		then:"user can do sucessful login"
		assert title=="Find a flight"
	}
	
	
}
