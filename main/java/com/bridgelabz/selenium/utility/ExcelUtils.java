package com.bridgelabz.selenium.utility;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

    static String projectPath;
    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

    //constructor
    public ExcelUtils(String excelPath,String sheetName){
        try {
            projectPath = System.getProperty("user.dir");
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public  int getRowCount() {
        int Row_Count = 0;
        try {

            Row_Count = sheet.getPhysicalNumberOfRows();
            System.out.println("Number of rows : "+Row_Count);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return Row_Count;
    }

    public  int getColumnCount() {
        int Column_Count = 0;
        try {

            Column_Count = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("Number of columns : "+Column_Count);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }
        return Column_Count;
    }

    public  String getCellData(int rowNum,int colNum) {
        String cellData = null;
        try {
            cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
            //System.out.println("Data is : "+cellData);
        } catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();

        }
        return cellData;

    }
}
