package Zip;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.io.FileInputStream;
import java.io.File;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Nikita\\Desktop\\text.zip");
        FileInputStream fin = new FileInputStream(file);
        ZipInputStream zipR = new ZipInputStream(fin);
        ZipEntry entry;
        while((entry = zipR.getNextEntry()) != null){
            if(!entry.isDirectory()){
                BufferedReader buff = new BufferedReader(new InputStreamReader(zipR));
                String line;
                while((line = buff.readLine()) != null ){
                    System.out.println(line);
                }
            }
            zipR.closeEntry();
        }
        zipR.close();

        //Add to ZIP
        ZipOutputStream zipW = new ZipOutputStream(new FileOutputStream(file,true));
        ZipEntry newEntry = new ZipEntry("test.txt");
        zipW.putNextEntry(newEntry);
        zipW.write("Тестовый текст!!!!".getBytes(StandardCharsets.UTF_8));
        zipW.closeEntry();
        zipW.close();
    }
}
