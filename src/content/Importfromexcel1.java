package content;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Importfromexcel1 
{
	
	public static void importdata() throws EncryptedDocumentException, IOException
	{
		String path="C:\\Users\\SUNNY\\Desktop\\Book1.xlsx";
		FileInputStream file = new FileInputStream(path);
		Sheet sheet = WorkbookFactory.create(file).getSheet("Sheet1");
		int lastrow=sheet.getLastRowNum();
		int lastcolumn=sheet.getRow(5).getLastCellNum();
		for (int i=0; i<=lastrow; i++)
		{
			for (int j=0; j<lastcolumn; j++)
			{
				String value = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		importdata();
		
	}
	
}
