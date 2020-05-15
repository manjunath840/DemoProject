package reading_data_from_excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Writing_dataTo_excel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//create and read the excel file
		FileInputStream fis = new FileInputStream("./Data/input4.xlsx");
		
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		Row r = sh.getRow(0);
		if (r==null)
		{
			sh.createRow(0);	
		}
		
		Cell c = r.getCell(1);
		if (c==null)
		{
			r.createCell(1);
			
		}
		
		//set the cell data
		c.setCellValue("haha");
		
		// to write the data
		
		FileOutputStream fos = new FileOutputStream("./Data/input4.xlsx");
		wb.write(fos);
		System.out.println("Done");
		
		
		}
		
		
	}

