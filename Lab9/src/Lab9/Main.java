package Lab9;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
public class Main {
    public static void main(String[] args) {
        try {
            //opens the file
            PrintWriter fileOutput = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("cinyaswishlist.txt")
                    )
            );
            //write the file
            fileOutput.println("flight to France");
            fileOutput.println("Apple Series 8 Watch");
            fileOutput.println("fragrances");
            fileOutput.println("a sense of style");
            fileOutput.println("my energy");
            //close the file
            fileOutput.close();
        }
        catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
