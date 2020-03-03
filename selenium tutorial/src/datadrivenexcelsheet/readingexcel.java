package datadrivenexcelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class readingexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream file =new FileInputStream("C:\\Users\\mahesh\\Documents\\practice.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet=wb.getSheet("sheet1"); // using sheet name
		//or we can get the sheet by using index also
		// XSSFSheet sheet=wb.getSheetAt(0); using index
		int row_count=sheet.getLastRowNum();//for getting how many rows in sheet with data
		int col_count =sheet.getRow(0).getLastCellNum();//to know last column count
		System.out.println(row_count);
		for(int i=0;i<row_count;i++)
		{
			XSSFRow current_row=sheet.getRow(i);// focus on the currnet row
			
			for(int j=0;j<col_count;j++)
			{
				String value=current_row.getCell(j).toString();
				System.out.print(" " + value);
			}
			System.out.println();
		}
		
	}

}
