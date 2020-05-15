package poi;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Table_format
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create and read data from excel
		FileInputStream fis= new FileInputStream("./Data/input1.xlsx");
		
		
		//create a work book
		Workbook wb= WorkbookFactory.create(fis);
		
		//create a sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//get the row
	 int r = sh.getLastRowNum();
		
		//get the cell
		Cell c=r.
		
		//get the value
		String v = c.getStringCellValue();		// if i want to access number from sheet it is giving the old value
		
		System.out.println(v);
		
		
	}

}
