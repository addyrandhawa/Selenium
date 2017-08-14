package resources;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldrivin {
	
public static	FileInputStream fis;
public static 	XSSFWorkbook wb;

	public ArrayList<String> getcelldata(int colnum) throws Exception {
		
		 fis=new FileInputStream("C:\\Users\\Gagan Randhawa\\eclipse-workspace\\multiple_logins\\src\\resources\\data.xlsx");
		 wb=new XSSFWorkbook(fis);
		 XSSFSheet Sheet=wb.getSheet("sheet1");
		 Iterator<Row> rowit=Sheet.iterator();
		
		 
		 ArrayList<String> list=new ArrayList<String>();
		 
		  while(rowit.hasNext()) {
			  list.add(rowit.next().getCell(colnum).getStringCellValue());
		  }
		  
		return list;
		 
	}
	
	
}
