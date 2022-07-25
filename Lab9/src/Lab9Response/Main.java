package Lab9Response;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            PrintWriter fileOutput = new PrintWriter(
                    new BufferedWriter(
                            new FileWriter("NicksWishList.txt")
                    )
            );

            fileOutput.println("PS5");
            fileOutput.println("Smoker");
            fileOutput.println("New Golf Clubs");
            fileOutput.println("Mercedes Benz");
            fileOutput.println("New Computer Parts");

            fileOutput.close();

        } catch (IOException ex) {
            System.out.println(ex);
        }
        File file = new File("NicksWishList.txt");
        if (file.exists()) {
            try {
                //opening the file
                BufferedReader inputFile = new BufferedReader(
                        new FileReader(file)
            );

                //read the file
                String line = inputFile.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = inputFile.readLine();
                }
                //close the file
                inputFile.close();
            }
            catch(IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
