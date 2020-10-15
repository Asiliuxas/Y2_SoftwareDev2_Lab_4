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
}
