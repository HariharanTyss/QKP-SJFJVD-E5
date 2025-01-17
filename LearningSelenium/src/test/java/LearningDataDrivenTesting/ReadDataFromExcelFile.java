package LearningDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {

	@Test(enabled = false)
	public void readSingleData() throws EncryptedDocumentException, IOException {
		// Steps To Fetch The Data From External Resources--Excel File

		// 1. Convert The Physical File Into Java Understandable
		FileInputStream fis = new FileInputStream("./Data/EmployeeDetails.xlsx");

		// 2.Create An WorkBook Using WorkBookFactory
		Workbook wb = WorkbookFactory.create(fis);

		// 3.Using WorkBook, Get the Sheet control
		Sheet sheet = wb.getSheet("BasicData");

		// 4.Using Sheet, Get the Row Control
		Row row = sheet.getRow(1);

		// 5.Using Row, Get The Column Control
		Cell column = row.getCell(1);

		// 6.Using Column, Get the Cell Data Value And Store it
		String data = column.getStringCellValue();

		// Print the data
		// System.out.println(data);

		// Optimized code
		String data1 = wb.getSheet("BasicData").getRow(1).getCell(1).getStringCellValue();
		System.out.println(data1);

		String data2 = wb.getSheet("BasicData").getRow(2).getCell(1).getStringCellValue();
		System.out.println(data2);

		String data3 = wb.getSheet("BasicData").getRow(3).getCell(1).getStringCellValue();
		System.out.println(data3);

		String data4 = wb.getSheet("BasicData").getRow(4).getCell(1).getStringCellValue();
		System.out.println(data4);

		String data5 = wb.getSheet("BasicData").getRow(5).getCell(1).getStringCellValue();
		System.out.println(data5);

		double data6 = wb.getSheet("BasicData").getRow(1).getCell(0).getNumericCellValue();
		System.out.println(data6);

		boolean data7 = wb.getSheet("BasicData").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(data7);

	}

	@Test(enabled = true)
	public void readMultipleData() throws EncryptedDocumentException, IOException {

		// Steps To Fetch The Data From External Resources--Excel File

		// 1. Convert The Physical File Into Java Understandable
		FileInputStream fis = new FileInputStream("./Data/EmployeeDetails.xlsx");

		// 2.Create An WorkBook Using WorkBookFactory
		Workbook wb = WorkbookFactory.create(fis);

		// Fetch All Data From one Specific Column------ From Excel File

		int lastrow = wb.getSheet("BasicData").getLastRowNum();
		System.out.println(lastrow);

		for (int i = 1; i <= lastrow; i++) {
			String data = wb.getSheet("BasicData").getRow(i).getCell(0).getStringCellValue();
			System.out.println(data);
		}

		System.out.println("-----------------------------");

		// Fetch All data From one Specific Row
		int lastnum = wb.getSheet("BasicData").getRow(1).getLastCellNum();

		for (int i = 0; i < lastnum - 1; i++) {
			String data = wb.getSheet("BasicData").getRow(1).getCell(i).getStringCellValue();

			System.out.print(data + "\t");
		}

		System.out.println("--------------------------------");

		// Fecth The All Data From multiple Record
		// (Exclude Last Column Data in Each Records...)
		for (int i = 1; i <= lastrow; i++) {
			int lastcolumn = wb.getSheet("BasicData").getRow(i).getLastCellNum();
			for (int j = 0; j < lastcolumn - 1; j++) {
				String data = wb.getSheet("BasicData").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + "\t");
			}
			System.out.println();
		}

	}

}
