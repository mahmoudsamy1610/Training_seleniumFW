package Data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLoader {
	
	
	static FileInputStream fis = null ;

    public FileInputStream StreamExcel () {
    	
	
    	String filePath = System.getProperty("user.dir")+"\\src\\test\\java\\Data\\userdata.xlsx" ;
    	File srcFile = new File(filePath);
    	
    	try {
			fis = new FileInputStream(srcFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			//System.exit(0);
		}
    		
    	return fis ;
	
}
	
	public Object [] [] getExcelData() throws IOException  {
		
		fis = StreamExcel();
		
		
	     	XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0) ;
			
			int TotalNumberOfRows = (sheet.getLastRowNum()+1) ; // to determine how much data repeat mahmoud ,, samy ,, test
			int TotalNumberOfcols = 4 ; // as we have only 4 data type
			
			String [][] arrayExcelData = new String [TotalNumberOfRows][TotalNumberOfcols] ;

			for (int i=0; i< TotalNumberOfRows; i++) {
				for (int j=0; j< TotalNumberOfcols; j++) {
				
					XSSFRow row = sheet.getRow(i) ;
					arrayExcelData[i][j] = row.getCell(j).toString() ;
														}
														}
		
			
			wb.close();
			return arrayExcelData;

			
				
			}


			
			
		}
		
	
	
	

