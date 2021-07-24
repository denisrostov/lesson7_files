package utils;

import com.codeborne.pdftest.PDF;
import com.codeborne.xlstest.XLS;
import org.apache.commons.io.FileUtils;
import org.apache.poi.hwpf.HWPFDocument;
import org.apache.poi.xwpf.extractor.XWPFWordExtractor;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.hwpf.extractor.WordExtractor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public  class Files {
    public static String readTextFromFile(File file) throws IOException {
        return FileUtils.readFileToString(file, StandardCharsets.UTF_8);
    }

    public static String readTextFromPath(String path) throws IOException {
        File file = new File(path);
        return readTextFromFile(file);
    }
    public static File getFile(String path) {
        return new File(path);
    }

    public static PDF getPdf(String path) throws IOException {
        return new PDF(getFile(path));
    }
    public static XLS getXls(String path) throws IOException {
        return new XLS(getFile(path));
    }
    public static XWPFWordExtractor readDocx (String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        XWPFDocument doc = new XWPFDocument(fis);
        return new XWPFWordExtractor(doc);
    }
    public static WordExtractor readDoc (String path) throws IOException {
        FileInputStream fis = new FileInputStream(path);
        HWPFDocument doc = new HWPFDocument(fis);
        return new WordExtractor(doc);
    }
}
