package com.bridgelabz.selenium.utility;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "test1")
    public static Object[][] getData() {
        String excelPath =("C:\\Users\\irg\\IdeaProjects\\DDD_Framework\\src\\test\\resources\\Test_Data.xlsx");

        return testData(excelPath,"Sheet1");
    }

    public static Object[][] testData(String excelPath, String sheetName) {
        ExcelUtils excel = new ExcelUtils(excelPath,sheetName);
        int Row_Count = excel.getRowCount();
        int Column_Count = excel.getColumnCount();

        Object[][] data = new Object[Row_Count - 1][Column_Count];

        for(int i =1;i<Row_Count;i++){
            for(int j=0;j<Column_Count;j++){
                String cellData = excel.getCellData(i,j);
                System.out.print(cellData+" | ");
                data[i-1][j] = cellData;
            }
            System.out.println();
        }
        return data;
    }


}
