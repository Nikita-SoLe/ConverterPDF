package PDF;

import java.io.*;

public class writeTXT {

    public static void write(String str) throws IOException {
        byte[] mas = str.getBytes();

        File file = new File(getFileName());

        if(!file.exists()) file.createNewFile();

        try (
                FileOutputStream fos = new FileOutputStream(file);
                ) {
            fos.write(mas);
        }
    }

    private static String getFileName() throws IOException {
        try (
                BufferedReader readLn = new BufferedReader(new InputStreamReader(System.in));

                ) {
            System.out.println("Введите название файла с полным путем к нему, где будет находится записанный файл");
            return readLn.readLine();
        }
    }
}
