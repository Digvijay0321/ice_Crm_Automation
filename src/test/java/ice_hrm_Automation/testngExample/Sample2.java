package ice_hrm_Automation.testngExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sample2 {

	 @BeforeSuite 
	 public void beforeSuite(){
	        System.out.println("this is before suite from sample2 class");
	       }
	 @BeforeTest public void beforeTest(){
         System.out.println("This is before test from sample2 class");
       }
	 @BeforeClass
		public void beforeClass(){ 
			System.out.println("Sample2 Before class");
		    }
	 @BeforeMethod
		public void beforeMethod(){ 
			System.out.println("Sample2 Before method");
			}
	 @org.testng.annotations.Test
		public void sample2Test1(){ 
			System.out.println("This is test1 from sample2 class");
			} 
		@org.testng.annotations.Test
		public void sample2Test2(){ 
			System.out.println("This is test2 from sample2 class"); 
			} 
		@org.testng.annotations.Test
		public void sample2Test3(){ 
			System.out.println("This is test3 from sample2 class");
		    } 
		@AfterMethod
		public void afterMethod(){
	       System.out.println("Sample2 after method"); 
		    }
		@AfterClass
		public void afterClass(){
			System.out.println("Sample2 After class"); 
			}
		 @AfterTest public void afterTest(){ 
	         System.out.println("This is after test from sample2 class");
	       }
		 @AfterSuite public void afterSuite(){ 
		        System.out.println("this is after suite from sample2 class"); 
		      }
}
