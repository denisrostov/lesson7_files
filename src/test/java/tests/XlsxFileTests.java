package tests;

import com.codeborne.xlstest.XLS;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.getXls;

public class XlsxFileTests {
    @Test
    void xlsxSimpleTest() throws IOException {
        String xlsFilePath = "./src/test/resources/files/testfile.xlsx";
        String expectedData = "январь 2021";

        XLS xls = getXls(xlsFilePath);
        assertThat(xls, XLS.containsText(expectedData));
    }




}