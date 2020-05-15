package reading_data_from_excel;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class getData_FromExcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		//create and read the excel file
		FileInputStream fis = new FileInputStream("./Data/input3.xlsx");
		
		
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int rc = sh.getLastRowNum();
		
		for (int i = 0; i <=rc; i++) 
		{
			int  cc = sh.getRow(i).getLastCellNum();
			
			for (int j = 0; j < cc; j++)
			{
				String data = sh.getRow(i).getCell(j).toString();
				
				System.out.print(data +" ");
				
				
			}
			System.out.println();
		}
		
		
	}

}
