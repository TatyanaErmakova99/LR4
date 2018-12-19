import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class NewFigure extends Figure {
   public void Scan() throws Exception {
       FileWriter nFile2 = new FileWriter("file2.txt");
       String s2="";
       String s3="";
       System.out.println("Создали второй файл");
            try{
                 FileInputStream fstream = new FileInputStream("file1.txt");
                 BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            while ((s3 = br.readLine()) != null){
                 System.out.println(s3);
                 s2=s3;
                 nFile2.write(s2);
                 nFile2.close();
             }
                 }catch (IOException e){
                System.out.println("Ошибка");
             }


    }
}