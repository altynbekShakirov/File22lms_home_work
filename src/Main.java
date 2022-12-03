
import java.io.FilterReader;
import java.io.FilterWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
       try( FileReader fileReader= new FileReader("Alfavit.txt")) {
           Scanner scanner= new Scanner(fileReader);
           int counter= 1;
           while (scanner.hasNextLine()){

               System.out.println(counter+++":"+scanner.nextLine());


           }
       }catch (IOException e){
           System.err.println("NO such file!!");
       }

        fileAlphabet();
    }

    private static void fileAlphabet() {
        try (FileWriter filterWriter= new FileWriter("Alfavit.txt")){

                for (char c = 'A', i = 'a'; c <= 'Z'; c++, i++) {
                    filterWriter.write(c + " " + i + "\n");

                }
                for (int i = 0; i < 10; i++) {
                    filterWriter.write(i + " \n");

        }

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}