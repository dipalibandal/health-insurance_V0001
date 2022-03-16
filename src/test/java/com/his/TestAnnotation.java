package com.his;

import org.testng.annotations.*;

public class TestAnnotation {

	@Test
	public void a2() {
		System.out.println("a2 @test is execting");
	}

	@BeforeSuite
	public void b() {
		System.out.println("@BeforeSuite");
	}

	@BeforeTest
	public void c() {
		System.out.println("@BeforeTest");
	}

	@BeforeClass
	public void d() {
		System.out.println("@Beforeclass");
	}

	@BeforeMethod
	public void e() {
		System.out.println("@Beforemethod");
	}

	@AfterClass
	public void f() {
		System.out.println("@Afterclass");
	}

	@AfterTest()
	public void g() {
		System.out.println("@Aftertest");
	}

	@AfterMethod()
	public void h() {
		System.out.println("@Aftermethod");
	}

	@AfterSuite()
	public void i() {
		System.out.println("@AfterSuite");
	}

	@Test
	public void a1() {
		System.out.println("a1 execute");
	}

	public static void main(String[] args) {
		System.out.println("Hello selenium");
	}
}
