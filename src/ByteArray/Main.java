package ByteArray;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException  {
        File file = new File("C:\\Users\\Nikita\\Desktop\\source.bin");
        File copy = new File("C:\\Users\\Nikita\\Desktop\\dest.bin");
        FileInputStream fin =  new FileInputStream(file);
        FileOutputStream out = new FileOutputStream(copy, true);
        int bin;
        while ((bin = fin.read()) != -1){
            out.write(bin);
        }
        fin.close();
        out.close();

    }
}
