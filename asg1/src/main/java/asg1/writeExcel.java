package asg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.*;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class writeExcel {
	public static void main(String args[]) throws Exception {
	try {
		asg1_RealTime trivia= new asg1_RealTime();
		
		//create sheet
		HSSFWorkbook wbook = new HSSFWorkbook();
		HSSFSheet sheet = wbook.createSheet("Trivia Table");
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = row.createCell(0);
		
		//
		int n =0;
		for(Data_info dai : asg1_RealTime.searchInfo()) {
			
			row =sheet.createRow(n++);
			
			//create data in 1st cell
			Cell c1 = row.createCell(0);
			c1.setCellValue(dai.getTh());
			
			//create data in 2nd cell
			Cell c2 = row.createCell(1);
			c2.setCellValue(dai.getTd());
			
		//adjust column size in excel	
		for(int t=0;t<24;t++) {
			sheet.autoSizeColumn(t);
		}
		
		}
		
		//create excel file
		FileOutputStream out = new FileOutputStream(new File("C:\\Users\\Asus\\RealTime_Asg1\\Trivia.xls"));
		wbook.write(out);
		out.close();
		wbook.close();
		System.out.println("Excel written successfully!!");
	
		
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
		}

}
