package excel;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MapWithDataProvider {
	@Test(dataProvider = "testdata")
	public void test(Map<Object, Object> mapdata) {
		System.out.println("-----------Test Started----------");
		System.out.println(mapdata.get("User Name"));
		System.out.println(mapdata.get("Password"));
		System.out.println(mapdata.get("DOB"));
		System.out.println("------------Test End--------------");
	}

	@DataProvider(name = "testdata")
	public Object[][] driverProvideMethod() throws Exception {
		FileInputStream fi = new FileInputStream("D:\\LiveProject_17_AUG_630PM" 
																						+ "\\testdata\\sample.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		// Define map & object array
		Object[][] obj = new Object[rowCount][1];
		for (int i = 0; i < rowCount; i++) {
			HashMap<Object, Object> dataMap = new HashMap<Object, Object>();
			for (int j = 0; j < colCount; j++) {
				// Reading cell data & store in Map
				dataMap.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
			}
			obj[i][0] = dataMap;
		}
		return obj;
	}
}


