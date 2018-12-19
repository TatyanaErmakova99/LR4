import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Figure {
    public void Scan() throws Exception{
        Scanner sc = new Scanner(System.in);
        FileWriter nFile = new FileWriter("file1.txt");
        String s1;
        System.out.println("После того как впишите название фигуры, проверьте файл1, в нем ваша фигура:)");
        s1 = sc.nextLine();
        nFile.write(s1);
        nFile.close();
    }

    public String Return() {
        return("Введите название фигуры, мы запишем ее в файл!");
    }
}