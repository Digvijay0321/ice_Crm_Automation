package ice_hrm_Automation.testngExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sample4 {
	@BeforeSuite 
	 public void beforeSuite(){
	        System.out.println("this is before suite from sample4 class");
	       }
	 @BeforeTest public void beforeTest(){
        System.out.println("This is before test from sample4 class");
      }
	 @BeforeClass
		public void beforeClass(){ 
			System.out.println("Sample4 Before class");
		    }
	 @BeforeMethod
		public void beforeMethod(){ 
			System.out.println("Sample4 Before method");
			}
	 @org.testng.annotations.Test
		public void sample4Test1(){ 
			System.out.println("This is test1 from sample4 class");
			} 
		@org.testng.annotations.Test
		public void sample4Test2(){ 
			System.out.println("This is test2 from sample4 class"); 
			} 
		@org.testng.annotations.Test
		public void sample4Test3(){ 
			System.out.println("This is test3 from sample4 class");
		    } 
		@AfterMethod
		public void afterMethod(){
	       System.out.println("Sample4 after method"); 
		    }
		@AfterClass
		public void afterClass(){
			System.out.println("Sample4 After class"); 
			}
		 @AfterTest public void afterTest(){ 
	         System.out.println("This is after test from sample4 class");
	       }
		 @AfterSuite public void afterSuite(){ 
		        System.out.println("this is after suite from sample4 class"); 
		      }

	
}
