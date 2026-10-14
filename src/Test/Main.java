package Test;

import java.io.IOException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.File;
import java.io.BufferedWriter;
import java.io.PrintWriter;

public class Main{

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Nikita\\Desktop\\text.txt");

        OutputStream fos = new FileOutputStream(file,true);
        OutputStreamWriter os = new OutputStreamWriter(fos, "UTF-8");
        BufferedWriter buff = new BufferedWriter(os);
        PrintWriter pw = new PrintWriter(buff);

        pw.println("Hello world! Nice sout");
        pw.close();
    }

}
