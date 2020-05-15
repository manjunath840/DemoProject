package poi;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_row_countOfSheet
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//create and read data from excel
		FileInputStream fis= new FileInputStream("./Data/input2.xlsx");
		
		
		//create a work book
		Workbook wb= WorkbookFactory.create(fis);
		
		//create a sheet
		Sheet sh = wb.getSheet("Sheet1");
		
		//get the row count 
		int r = sh.getLastRowNum();
		
		System.out.println(r);
		
		
	
		
		
	}

}
