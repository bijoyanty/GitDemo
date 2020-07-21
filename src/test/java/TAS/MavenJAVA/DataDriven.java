package TAS.MavenJAVA;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {
	
	public static void main (String args[]) throws IOException {
		
		
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\ID041811\\Documents\\list of items.xlsx");
		XSSFWorkbook test = new XSSFWorkbook(file);
		
XSSFSheet sheet = test.getSheetAt(0);


Iterator <Row> rows= sheet.iterator();

Row desired;

while(rows.hasNext()) {
	
	desired=rows.next();
	

Iterator <Cell> ce= desired.iterator();

while(ce.hasNext()) {
	
	Cell value = ce.next();
	
			if(value.getCellType().toString().equalsIgnoreCase("String"))
			{
	if(value.getStringCellValue().contains("chana")) {
		
	
	
	System.out.println(value.getStringCellValue());
	
	}
	}
		
	
		
	
	
}
	





	
	
}
	
	}

}
