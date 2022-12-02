package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenExcel {

	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\johnt\\eclipse-workspace\\FrameWork\\src\\test\\resources\\Test1.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb=new XSSFWorkbook(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		Row row=sheet.getRow(1);
		Cell cell=row.getCell(0);
		
		System.out.println(cell.getCellType());
		
		Date date=new Date();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
		String format = dateFormat.format(date);
		System.out.println(date);
		System.out.println(format);
		
//		if(DateUtil.isCellDateFormatted(cell))
//		{
//			Date dateCellValue =cell.getDateCellValue();
//			SimpleDateFormat dateFormat1=new SimpleDateFormat("dd/mm/yy");
//			String format1=dateFormat.format(dateCellValue);
//			System.out.println(format1);
//		}
		
		if(cell.getStringCellValue().equals("johntyrhotes"))
		{
			cell.setCellValue("Bhuvanesh");
		}
		else
		{
			System.out.println("johntyrhotes");
		}
		
		FileOutputStream out=new FileOutputStream(file);
		wb.write(out);
		
		
//		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
//		System.out.println(physicalNumberOfRows);
		
//		for(int i=0;i<sheet.getPhysicalNumberOfRows();i++)
//		{
		
//			Row row1=sheet.getRow(i);
//			for(int j=0;j<row1.getPhysicalNumberOfCells();j++)
//			{
//				
//			System.out.println(row1.getCell(j));
//			}
//		}
//		
		
	}

}
