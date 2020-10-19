import javax.imageio.spi.ImageReaderWriterSpi;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Q3_2 {
    public static void main(String[] args) throws FileNotFoundException {
        String file_name = "Divider";   // File name, same as in Q2
        int file_count = 5;             // File count, same or less than the one in Q2
        File[] files = new File[file_count];
        for(int i = 0; i < file_count; i++){
            files[i] = new File(".\\content\\out\\"+file_name+(i+1)+".txt");
        }
        int rand;
        File temp;
        for(int i = 0; i < file_count; i++){
            rand = (int)Math.round(Math.random()*file_count);
            temp = files[rand];
            files[rand] = files[i];
            files[i] = temp;
        }
        for(int i = 0; i < file_count; i++){
            PrintWriter pw = new PrintWriter(files[i]);
            pw.close();
        }
    }
}
