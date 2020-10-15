import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q2 {
    /**
     * Takes a specified file and divides it up into multiple other files located at "content/out/" folder.
     * @param args fug if i know.
     * @throws FileNotFoundException Some error, got no clue.
     */
    public static void main(String[] args) throws FileNotFoundException {
        String[] words = ReadFile.toArray("Lab 3");
        Scanner sc = new Scanner(System.in);
        int divider = 5;    //  Amount of files to divide into
        String file_name = "Divider";   //  File names for the dividers
        PrintWriter[] file_output = new PrintWriter[divider];
        for(int i = 0; i<divider;i++)
            file_output[i] = new PrintWriter(".\\content\\out\\"+file_name+(i+1)+".txt");
        for (int i = 0; i<words.length;i++)
            file_output[i%divider].print(words[i]+" ");
        for (PrintWriter file : file_output)
            file.close();
        System.out.printf("Filide divided into %d under the name %s# successfully.",divider,file_name);
    }
}
