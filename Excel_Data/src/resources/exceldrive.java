package resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldrive {
	
	public static XSSFWorkbook wb;

	public static XSSFSheet sheet;

	public static XSSFRow row;

	public static XSSFCell cell;

	public static FileInputStream fis;
	
	
	    public static String getCelldata(int rownum) throws IOException {
		
		 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
		 wb =new XSSFWorkbook(fis);
		 sheet= wb.getSheet("home");
		 String value=sheet.getRow(rownum).getCell(0).getStringCellValue();
		 System.out.println(value);
		 return value;
		}
		 
		
	}
	

