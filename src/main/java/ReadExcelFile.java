/*
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

*/
/**
 * Created by garich01 on 4/6/2017.
 *//*

public class ReadExcelFile {

    public void readFile() throws IOException {
        String classLoader = getClass().getClassLoader().getResource("file/WAF-3PTBlocksNeedingTesting.xlsx").getFile();
        // File file = new File(classLoader.getResource("file/test.xml").getFile());
        //String excelFilePath = "file/WAF-3PT Blocks Needing Testing.xlsx";//provide the correct file
        FileInputStream inputStream = new FileInputStream(new File(classLoader));
        // InputStream inputStream1=new Input

        //loads the excel file
        Workbook workbook = new XSSFWorkbook(inputStream);
        //looks at the first sheet
        Sheet firstSheet = workbook.getSheetAt(0);
        //iterate thru the first sheet
        Iterator<Row> iterator = firstSheet.iterator();


        while (iterator.hasNext()) {
            Row nextRow = iterator.next();
            //iterate thru the cell values
            Iterator<Cell> cellIterator = nextRow.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();
               // switch(cell.)

                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:
                        System.out.print(cell.getStringCellValue());
                        break;
                    case Cell.CELL_TYPE_BOOLEAN:
                        System.out.print(cell.getBooleanCellValue());
                        break;
                    case Cell.CELL_TYPE_NUMERIC:
                        System.out.print(cell.getNumericCellValue());
                        break;
                }
                System.out.print(" - ");
            }
            System.out.println();
        }

        // inputStream.close(); workbook.close()
        inputStream.close();
    }
}
*/
