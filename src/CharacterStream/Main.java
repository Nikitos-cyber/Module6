package CharacterStream;


import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import  java.io.FileOutputStream;
import java.io.File;

public class Main {
    public static void main(String[] args) {
            try {


                BufferedReader buff = new BufferedReader(new InputStreamReader(System.in, "UTF-8"));
                String str = buff.readLine();

                File file = new File ("C:\\Users\\Nikita\\Desktop\\ user.txt");
                BufferedWriter writer  = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF-8"));
                writer.write(str);
                writer.close();
                buff.close();

            } catch (IOException e){
                System.out.println(e.getMessage());
            }



    }
}
