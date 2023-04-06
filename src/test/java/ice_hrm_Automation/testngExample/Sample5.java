package ice_hrm_Automation.testngExample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Sample5 {
 
	@BeforeSuite 
	 public void beforeSuite(){
	        System.out.println("this is before suite from sample5 class");
	       }
	 @BeforeTest public void beforeTest(){
        System.out.println("This is before test from sample5 class");
      }
	 @BeforeClass
		public void beforeClass(){ 
			System.out.println("Sample5 Before class");
		    }
	 @BeforeMethod
		public void beforeMethod(){ 
			System.out.println("Sample5 Before method");
			}
	 @org.testng.annotations.Test
		public void sample5Test1(){ 
			System.out.println("This is test1 from sample5 class");
			} 
		@org.testng.annotations.Test
		public void sample5Test2(){ 
			System.out.println("This is test2 from sample5 class"); 
			} 
		@org.testng.annotations.Test
		public void sample5Test3(){ 
			System.out.println("This is test3 from sample5 class");
		    } 
		@AfterMethod
		public void afterMethod(){
	       System.out.println("Sample5 after method"); 
		    }
		@AfterClass
		public void afterClass(){
			System.out.println("Sample5 After class"); 
			}
		 @AfterTest public void afterTest(){ 
	         System.out.println("This is after test from sample5 class");
	       }
		 @AfterSuite public void afterSuite(){ 
		        System.out.println("this is after suite from sample5 class"); 
		      }

}
