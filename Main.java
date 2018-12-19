import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main  {
    public void figures(NewFigure figure) {
        System.out.println("\n ");
        figure.Return();
        System.out.println(figure.Return() + "\t ");
    }

    public static void main(String[] args) throws Exception{
        Main main=new Main();
        NewFigure figure = new NewFigure();
        Figure figureo = new Figure();
        main.figures(figure);
        figureo.Scan();
        figure.Scan();
    }
}
