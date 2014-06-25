package com.data.driven;

import java.io.FileInputStream;
import java.util.Properties;

import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;

public class LoginDataDriven {
	
	Sheet mSheet = null;
	int mSheetCount = 0;
	String[][] credentials= null;
	Properties prop;
	
	
	
	@SuppressWarnings("null")
	public String[][] fReadingData() throws Exception{
		
		
		
		FileInputStream fs = new FileInputStream("D:/POC/ValmontSelenium/ValmontSelenium/RelatedFiles/inputdetails.xls");
		Workbook Wb = Workbook.getWorkbook(fs);
		mSheetCount = Wb.getNumberOfSheets();
		System.out.println("The Total count of the sheet is: " +mSheetCount);
		for(int i=0; i<mSheetCount; i++){
			mSheet = Wb.getSheet(i);
			credentials = new String[mSheet.getColumns()][mSheet.getRows()];
			System.out.println("The Rows are in the Sheet is: " +mSheet.getRows());
			System.out.println("The Total columns in the Sheet is: " +mSheet.getColumns());
			System.out.println("The Sheet name is: " +mSheet.getName());
				
				
			
			/*for(int column=1; column<mSheet.getColumns()-1; column++){
			for(int row=1; row<mSheet.getRows(); row++){
				Cell cell = mSheet.getCell(column,row);
		          CellType type = cell.getType();
		          if (type == CellType.LABEL || type==CellType.NUMBER) {
		        	  credentials[column][row]=cell.getContents();
		            System.out.println("I got a label -- "+ cell.getContents());
		          }
			}
		}*/
		
			for(int row=1; row<mSheet.getRows(); row++){
				
			for(int column=1; column<mSheet.getColumns()-1; column++){
				
					Cell cell = mSheet.getCell(column,row);
			          CellType type = cell.getType();
			          if (type == CellType.LABEL || type==CellType.NUMBER) {
			        	  credentials[column][row]=cell.getContents();
			            System.out.println("I got a label -- "+ cell.getContents());
			          }
				}
			}
					
			
		}
		
		return credentials;
		
	}
	
	public int getRowsSize()
	{
		return mSheet.getRows();
	}
	
	public int getColumnsSize()
	{
		return mSheet.getColumns();
	}

	
	
	
}
