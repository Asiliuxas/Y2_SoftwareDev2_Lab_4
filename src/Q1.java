import java.io.FileNotFoundException;

public class Q1 {
    public static void main(String[] args) throws FileNotFoundException {
        String[] words = ReadFile.toArray("Lab 3");
        int counter = 0;
        for (String w : words) {
            counter++;
            if(counter%5==0)
                System.out.print(w+" ");
        }
    }
}

