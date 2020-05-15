package poi;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Read_NumberOfCell
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
		Row r = sh.getRow(0);
		
		//get the cell
		Cell c = r.getCell(0);
		
		//get the value
		String v = c.getStringCellValue();		// if i want to access number from sheet it is giving the old value
		
		System.out.println(v);
		
		
	}

}
