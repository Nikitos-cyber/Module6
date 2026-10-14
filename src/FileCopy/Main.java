package FileCopy;

import java.io.File;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Nikita\\Desktop\\text.txt");
        File file2 = new File("C:\\Users\\Nikita\\Desktop\\textCopy.txt");
        try(FileInputStream fin = new FileInputStream(file)){
            BufferedInputStream buffIn = new BufferedInputStream(fin);
            FileOutputStream fout = new FileOutputStream(file2);
            BufferedOutputStream buffOt = new BufferedOutputStream(fout);
            int bn;
            while((bn = buffIn.read()) != -1){
                buffOt.write(bn);
            }
            buffOt.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}