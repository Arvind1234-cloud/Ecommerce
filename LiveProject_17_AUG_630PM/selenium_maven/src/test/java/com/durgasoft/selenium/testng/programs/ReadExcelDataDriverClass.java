package com.durgasoft.selenium.testng.programs;

import org.testng.annotations.Test;

import excel.Excel_API;

public class ReadExcelDataDriverClass {
  @Test
  public void writeDataToExcelFile() throws Exception{
	 Excel_API e=new Excel_API("D:\\LiveProject_17_AUG_630PM\\testdata\\login.xlsx");
	 System.out.println("Writting cell data to exce file by using col number");
	 e.setCellData("Sheet1", 2, 1, "FAILED");
	 System.out.println("***************************************");
	 System.out.println("Writting cell data to exce file by using col Name");
	 e.setCellData("Sheet1", "Results", 5, "ABORTED");
  }
}
