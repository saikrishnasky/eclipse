package datadrivenexcelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class practicereadingfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file= new FileInputStream("C:\\Users\\mahesh\\Documents\\practice2.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		int colcount=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i);
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString();
				System.out.print(" " + value);
			}
			System.out.println();
		}
	}

}
