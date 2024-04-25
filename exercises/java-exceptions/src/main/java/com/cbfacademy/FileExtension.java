package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {
    private String filename; 

    public boolean check (String filename) throws FilenameException {
    //The check method should:
    //return true when the file extension is .java
    //return false when the file extension is not .java
    
    if (filename.endsWith(".java") ){
        return false;
    }
    else 
    if (filename == null || filename.trim().isEmpty())  {
            throw new FilenameException("Filename is empty or null");
    }
    else {
        return true;
    }

    //throw a custom checked exception called FilenameException (that you must create) 
    //when the file name is null or an empty string.
    }

    


    public Map<String, Integer> map(List<String> filenames) {
        //The map method should:
        // check each provided file's extension and map the returned value as 1 if true or 0 if false
        //map -1 when an exception occurs
        Map<String, Integer> mapExcep = new HashMap<>();

        for (String fileName : filenames) {
            ss
        }
    }



}
