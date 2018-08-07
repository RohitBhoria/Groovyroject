package org

import geb.Page

class LoginPageObjects extends Page {
	
	static content={
		name = {$("input", "#userName")} //method for driver.findElement
		password = {$("input", "#password")}
		loginButton = {$("input", "#login")}
	}

}
