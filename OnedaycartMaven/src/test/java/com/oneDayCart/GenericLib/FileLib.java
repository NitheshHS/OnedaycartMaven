package com.oneDayCart.GenericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class provides the data required for testscripts during execution
 * @author user
 *
 */


public class FileLib {
	public String getCommonKeyValue(String key) {
		Properties prop = null;
		try {
			FileInputStream file=new FileInputStream("./src/test/java/commonData/commonData.properties");
			prop=new Properties();
			prop.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(key);
	}
	/**
	 * This method read the data in excel and will provide the data when instance of class created
	 * @param sheetName
	 * @return
	 */
	public Object[][] readAlldataFromExcel(String sheetName){
		FileInputStream file;
		Object[][] data = null;
		try {
			file = new FileInputStream("./src/test/java/commonData/emails.xlsx");
			Workbook wb = WorkbookFactory.create(file);
			Sheet sh=wb.getSheet(sheetName);
			int rowCount=sh.getLastRowNum();
			int cellCount=sh.getRow(0).getLastCellNum();
			data =new Object[rowCount][cellCount];
			for(int i=0;i<rowCount;i++) {
				for(int j=0;j<cellCount;j++) {
					data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
}
