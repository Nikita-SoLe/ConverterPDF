package PDF;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadPDF {
    public static void main(String[] args) throws IOException {

        File pdfFile = new File(getNameFile());

        try {
            String text = readFile(pdfFile);
            writeTXT.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFile(File pdfFile) throws IOException {
        try (PDDocument document = PDDocument.load(pdfFile)) {
            PDFTextStripper pdfTextStripper = new PDFTextStripper();
            return pdfTextStripper.getText(document);
        }
    }

    private static String getNameFile() throws IOException {

        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите название файла с полным путем от корня");
        return read.readLine();

    }
}
