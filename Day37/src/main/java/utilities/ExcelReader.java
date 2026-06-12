package utilities;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.*;

public class ExcelReader {

    public static String getCellData() throws Exception {

        FileInputStream fis =
                new FileInputStream("src/test/resources/testdata.xlsx");

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        String data =
                wb.getSheetAt(0).getRow(1).getCell(0).getStringCellValue();

        wb.close();

        return data;
    }
}