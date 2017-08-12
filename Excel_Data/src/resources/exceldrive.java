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
	
	
	
	
	
	    public static String getCelldata(int rownum,int col) throws IOException {
		
		 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
		 wb =new XSSFWorkbook(fis);
		 sheet= wb.getSheet("home");
		 String value=sheet.getRow(0).getCell(0).getStringCellValue();
		 return value;
		}
		 
		
		    public static String getCelldata1(int rownum,int col) throws IOException {
			
			 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
			 wb =new XSSFWorkbook(fis);
			 sheet= wb.getSheet("home");
			 String value=sheet.getRow(1).getCell(0).getStringCellValue();
			 return value;
		}
		    
		    public static String getCelldata2(int rownum,int col) throws IOException {
				
				 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
				 wb =new XSSFWorkbook(fis);
				 sheet= wb.getSheet("home");
				 String value=sheet.getRow(2).getCell(0).getStringCellValue();
				 return value;
			}
		    
		    public static String getCelldata3(int rownum,int col) throws IOException {
				
				 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
				 wb =new XSSFWorkbook(fis);
				 sheet= wb.getSheet("home");
				 String value=sheet.getRow(3).getCell(0).getStringCellValue();
				 return value;
			}
		    
		    public static String getCelldata4(int rownum,int col) throws IOException {
				
				 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
				 wb =new XSSFWorkbook(fis);
				 sheet= wb.getSheet("home");
				 String value=sheet.getRow(4).getCell(0).getStringCellValue();
				 return value;
			}
		    
		    public static String getCelldata5(int rownum,int col) throws IOException {
				
				 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
				 wb =new XSSFWorkbook(fis);
				 sheet= wb.getSheet("home");
				 String value=sheet.getRow(5).getCell(0).getStringCellValue();
				 return value;
			}
		    
		    public static String getCelldata6(int rownum,int col) throws IOException {
				
				 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
				 wb =new XSSFWorkbook(fis);
				 sheet= wb.getSheet("home");
				 String value=sheet.getRow(6).getCell(0).getStringCellValue();
				 return value;
			}
		    
		    public static double getCelldata7(int rownum,int col) throws IOException {
				
				 fis = new FileInputStream("C:\\\\dataexcel\\\\data.xlsx");
				 wb =new XSSFWorkbook(fis);
				 sheet= wb.getSheet("home");
				 double value=sheet.getRow(7).getCell(0).getNumericCellValue();
				 return value;
			}
		    
		    public static String getCelldata8(int rownum,int col) throws IOException {
				
				 fis = new FileInputStream("C:\\dataexcel\\data.xlsx");
				 wb =new XSSFWorkbook(fis);
				 sheet= wb.getSheet("home");
				 String value=sheet.getRow(8).getCell(0).getStringCellValue();
				 return value;
			}
			
			 
			
		 
		
		
		
	

	
	
	
	}
	

