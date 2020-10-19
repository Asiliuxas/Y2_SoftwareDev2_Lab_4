import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    /**
     * Read specified file of "file_name" in content folder.
     * @param file_name Name of the file to be read without extension.
     * @return Returns words contained in the file as a String array.
     * @throws FileNotFoundException Some error, got no clue.
     */
    public static String[] toArray(String file_name) throws FileNotFoundException {
        File f = new File(".\\content\\"+file_name+".txt");
        Scanner sc = new Scanner(f);
        String contents = "";
        while(sc.hasNextLine())
            contents+=sc.nextLine();
        return contents.split(" ");
    }
    /**
     * Read specified file of "file_name" in content folder.
     * @param file_name Name of the file to be read without extension.
     * @return Returns single String that contains all of the contents of the file.
     * @throws FileNotFoundException Some error, got no clue.
     */
    public static String toString(String file_name) throws FileNotFoundException {
        File f = new File(".\\content\\"+file_name+".txt");
        Scanner sc = new Scanner(f);
        String contents = "";
        while(sc.hasNextLine())
            contents+=sc.nextLine();
        return contents;
    }
    /**
     * Read specified file of "file_name" in content folder.
     * Used for different directory to that of ".\\content\\"
     * @param file_name Name of the file to be read without extension.
     * @param directory Directory of where the file should be located.
     * @return Returns single String that contains all of the contents of the file.
     * @throws FileNotFoundException Some error, got no clue.
     */
    public static String toString(String directory, String file_name) throws FileNotFoundException {
        File f = new File(directory+file_name+".txt");
        Scanner sc = new Scanner(f);
        String contents = "";
        while(sc.hasNextLine())
            contents+=sc.nextLine();
        return contents;
    }
    /**
     * Read specified file of "file_name" in content folder.
     * Used for different directory to that of ".\\content\\"
     * @param file_name Name of the file to be read without extension.
     * @param directory Directory of where the file should be located.
     * @return Returns words contained in the file as a String array.
     * @throws FileNotFoundException Some error, got no clue.
     */
    public static String[] toArray(String directory, String file_name) throws FileNotFoundException {
        File f = new File(directory+file_name+".txt");
        Scanner sc = new Scanner(f);
        String contents = "";
        while(sc.hasNextLine())
            contents+=sc.nextLine();
        return contents.split(" ");
    }
    /**
     *
     * @param content
     * @return
     */
    public static String assess(String content){
        String output = "";
        String words[] = content.split(" ");
        output += "\nThe file contains "+words.length+" words. ";
        int vowels = 0;
        for (char c : content.toLowerCase().toCharArray()) {
            if (c == 'e' || c == 'u' || c == 'i' || c == 'o' || c == 'a')
                vowels++;
        }
        output += "There are "+vowels+" in the file. There is an average of "+(double)vowels/words.length+" vowels per word.";
        return output;
    }
    public static String assess(File file) throws FileNotFoundException {
        Scanner sc = new Scanner(file);
        String contents = "";
        while(sc.hasNextLine())
            contents+=sc.nextLine();
        String output = "";
        String words[] = contents.split(" ");
        output += "\nThe file contains "+words.length+" words. ";
        int vowels = 0;
        for (char c : contents.toLowerCase().toCharArray()) {
            if (c == 'e' || c == 'u' || c == 'i' || c == 'o' || c == 'a')
                vowels++;
        }
        output += "There are "+vowels+" in the file. There is an average of "+(double)vowels/words.length+" vowels per word.";
        return output;
    }
}
