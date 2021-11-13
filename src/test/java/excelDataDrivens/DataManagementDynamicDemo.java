package excelDataDrivens;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementDynamicDemo 
{
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> str) 
  {
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	    ExcelAPI e = new ExcelAPI("C:\\Users\\ravi\\Desktop\\suitex.xlsx");
		String sheetName = "data";
		String testCaseName = "TestB";
		
		return DataUtils.getTestData(e, sheetName, testCaseName);
		
  }
}
