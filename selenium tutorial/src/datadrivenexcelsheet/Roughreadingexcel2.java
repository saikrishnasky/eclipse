package datadrivenexcelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.*;

public class Roughreadingexcel2 {

	public static void main(String[] args) throws IOException  {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("C:\\Users\\mahesh\\Documents\\practice2.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("sheet1");
		int row_count=sheet.getLastRowNum();
		int col_count=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<row_count;i++) {
			Row currentRow=sheet.getRow(i);
			
			for(int j=0;j<col_count;j++)
			{
				String value=currentRow.getCell(j).toString();
				System.out.print("  " + value);
			}
			System.out.println();
		}
		
	}

}
