
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
           int counter= 0;
           while (scanner.hasNextLine()){
               counter++;
               System.out.println(counter+":"+scanner.nextLine());


           }
       }catch (IOException e){
           System.err.println("NO such file!!");
       }

        fileAlphabet();
    }

    private static void fileAlphabet() {
        try (FileWriter filterWriter= new FileWriter("Alfavit.txt")){
            filterWriter.write("Aa");
            filterWriter.write("\nBb");
            filterWriter.write("\nCc");
            filterWriter.write("\nDd");
            filterWriter.write("\nEe");
            filterWriter.write("\nFf");
            filterWriter.write("\nGg");
            filterWriter.write("\nHh");
            filterWriter.write("\nIi");
            filterWriter.write("\nJj");
            filterWriter.write("\nKk");
            filterWriter.write("\nLl");
            filterWriter.write("\nMm");
            filterWriter.write("\nNn");
            filterWriter.write("\nOo");
            filterWriter.write("\nPp");
            filterWriter.write("\nQq");
            filterWriter.write("\nRr");
            filterWriter.write("\nSs");
            filterWriter.write("\nTt");
            filterWriter.write("\nUu");
            filterWriter.write("\nVv");
            filterWriter.write("\nWw");
            filterWriter.write("\nXx");
            filterWriter.write("\nYy");
            filterWriter.write("\nZz");
            filterWriter.write("\n0");
            filterWriter.write("\n1");
            filterWriter.write("\n2");
            filterWriter.write("\n3");
            filterWriter.write("\n4");
            filterWriter.write("\n5");
            filterWriter.write("\n7");
            filterWriter.write("\n8");
            filterWriter.write("\n9");


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}