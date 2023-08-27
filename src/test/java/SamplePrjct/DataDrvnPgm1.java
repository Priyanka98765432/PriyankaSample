package SamplePrjct;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrvnPgm1 {

	public static void main(String[] args) throws IOException {
		
		File location = new File("C:\\Users\\tsbabu\\eclipse-workspace\\MavenExmpls\\src\\test\\resources\\TestData\\Test Data.xlsx");
		
		FileInputStream input = new FileInputStream(location);
		
		Workbook w = new XSSFWorkbook(input);
		
		Sheet s = w.getSheet("Sheet1");
		
		Row r = s.getRow(0);
		
		Cell c = r.getCell(0);
		
		System.out.println(c);
		

	}

}
