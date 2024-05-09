import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
     


    public List<String> readFile(String filename) throws FileNotFoundException{
        //returns a List<String> object, where each list item is a line from the specified file
        List<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("input-output/src/main/resources/exercise.txt"))) {
            String line;
            line = reader.readLine();

            while ( line != null) {
                lines.add(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
     }

       

    } 
    
    
    public void copy(String inputFile, String outputFile){
        /*copies the contents of a text file at the path defined by inputFile to the path defined by outputFile. 
        Creates outputFile if it doesn't exist and overwrites it, if it does */ 
    }

}

/*The paths to inputFile and outputFile are relative 
to the root directory of this repository 
(e.g. exercises/input-output/src/main/resources/exercise.txt) */