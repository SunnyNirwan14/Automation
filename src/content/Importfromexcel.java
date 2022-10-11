package content;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Importfromexcel 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		//Import data by String type
		
		String path = "C:\\Users\\SUNNY\\Desktop\\Book1.xlsx";
		
		FileInputStream file=new FileInputStream(path);
		
		String value= WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		
		
		//Import data by Numeric type
		
		
		Thread.sleep(1000);
		String path1 = "C:\\Users\\SUNNY\\Desktop\\Book1.xlsx";
		
		FileInputStream file1=new FileInputStream(path1);
		
		double value1= WorkbookFactory.create(file1).getSheet("Sheet1").getRow(6).getCell(0).getNumericCellValue();
		
		System.out.println(value1);
	}

}
