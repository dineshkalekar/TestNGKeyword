package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class xlutility {

	public String path, sheetname; // Global two variable created

	xlutility(String path, String sheetname) // Constructor
	{

		this.path = path;

		this.sheetname = sheetname;
	}

	public int getcolumcount(String path, String sheetname) throws EncryptedDocumentException, IOException {

		File f1 = new File(path);

		FileInputStream input = new FileInputStream(f1);

		Workbook wb = WorkbookFactory.create(input);

		Sheet sh = wb.getSheet(sheetname);

		Row rw = sh.getRow(0);

		int columcount = rw.getLastCellNum();

		return columcount;

	}

	public int getrowcount(String path, String sheetname) throws EncryptedDocumentException, IOException {

		File f1 = new File(path);

		FileInputStream input = new FileInputStream(f1);

		Workbook wb = WorkbookFactory.create(input);

		Sheet sh = wb.getSheet(sheetname);

		Row rw = sh.getRow(0);
		
		int rowcount=sh.getLastRowNum();
		
		return rowcount;

	}

	public void getcellvalue(String path,String sheetname,int row,int colum) throws EncryptedDocumentException, IOException {
		
		File f1 = new File(path);

		FileInputStream input = new FileInputStream(f1);

		Workbook wb = WorkbookFactory.create(input);

		Sheet sh = wb.getSheet(sheetname);
		
		Row rw=sh.getRow(row);
		
		Cell cl=rw.getCell(colum);
		
		String data="";
		
		try {
			DataFormatter formatter=new DataFormatter();
			data=formatter.formatCellValue(cl);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
