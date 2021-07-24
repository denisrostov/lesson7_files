package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.*;

public class DocxTestFile {
    @Test
    void checkDocxFile() throws IOException {
        String path = "./src/test/resources/files/test.docx";
        String expectedData = "Aviakassa";
        String actualData = readDocx(path).getText();
        assertThat(actualData, containsString(expectedData));
    } @Test
    void checkDocFile() throws IOException {
        String path = "./src/test/resources/files/test.doc";
        String expectedData = "Aviakassa";
        String actualData = readDoc(path).getText();
        assertThat(actualData, containsString(expectedData));
    }
}
