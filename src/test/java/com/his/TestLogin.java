package com.his;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLogin {
	@Test
	
	public void loginPage1() {
		Loginpage lp = new Loginpage();
		Assert.assertEquals(0,lp.userLogin("abc","abc345"));
	}

	@Test
	public void loginPage2() {
		Loginpage lp = new Loginpage();
		Assert.assertEquals(1,lp.userLogin("abc","abc@123"));
	}
}
