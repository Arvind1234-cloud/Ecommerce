package excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteExcelDataByFontStyle {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow row;
	public XSSFCell cell;
	public XSSFFont font;
	public XSSFCellStyle style;

	@Test
  public void f()throws Exception {
	    fi = new FileInputStream("D:\\LiveProject_17_AUG_630PM\\testdata\\login.xlsx");
		w = new XSSFWorkbook(fi);
		s = w.getSheet("Sheet1");
		row=null;
		cell=null;
		font=w.createFont();
		style=w.createCellStyle();
		row=s.getRow(4);
		if(row==null)
			row=s.createRow(4);
		cell=row.getCell(3);
		if(cell==null)
			cell=row.createCell(3);
		font.setFontName("Arial Black");
		font.setFontHeight(9);
		font.setBold(true);
		style.setFont(font);
		cell.setCellStyle(style);
		cell.setCellValue("SKIPPED");
		fo=new FileOutputStream("D:\\LiveProject_17_AUG_630PM\\testdata\\login.xlsx");
		w.write(fo);
		fo.close();
  }
}
