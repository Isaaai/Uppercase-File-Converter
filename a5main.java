import java.util.Scanner;
import java.io.*;

public class a5main{
    public static void main(String[] args) throws IOException{
        
        String inputFirstFile;
        String outputSecondFile;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter the name of the input file");
        inputFirstFile = keyboard.nextLine();
        
        File readfile = new File(inputFirstFile);
        Scanner inputFile = new Scanner(readfile);
        
        System.out.println("Enter the name of the file you want"
                + " to convert into upper case.");
        outputSecondFile = keyboard.nextLine();
        
        PrintWriter outputFile = new PrintWriter(outputSecondFile);
        
        while(inputFile.hasNext())
        {
            String line = inputFile.nextLine();
            outputFile.println(line.toUpperCase());
        }
        inputFile.close();
        
        outputFile.close();
        
    }
}
