import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Q3 {
    public static void main(String[] args) throws FileNotFoundException {
        String file_name = "Divider";   // File name, same as in Q2
        int file_count = 5;             // File count, same or less than the one in Q2
        String temp_content;
        PrintWriter temp_file;
        int rand;
        for (int i = 1;i<=file_count;i++){
            rand = (int)Math.round(Math.random()*file_count+1);                                     // Set rand as random number for file
            temp_content = ReadFile.toString(".\\content\\out\\", file_name+rand); // Save contents of file_name[rand] as temp
            temp_file = new PrintWriter(".\\content\\out\\"+file_name+rand+".txt");        // Create new file file_name[rand]
            temp_file.print(ReadFile.toString(".\\content\\out\\",file_name+i));   // Give file_name[rand] content from file_name[i]
            temp_file.close();                                                                      // Close and save file_name[rand]
            temp_file = new PrintWriter(".\\content\\out\\"+file_name+i+".txt");            // Create new file file_name[i]
            temp_file.print(temp_content);                                                          // Give file_name[i] temp content
            temp_file.close();                                                                      // Close and save file_name[i]
        }
        System.out.println("Files scrabbled successfully.");
    }
}
