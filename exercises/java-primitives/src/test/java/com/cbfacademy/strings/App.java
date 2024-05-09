package com.cbfacademy.strings;

import static org.junit.jupiter.api.DynamicTest.stream;

public class App {
    public static void main( String [] args ) {
    String word1 = "First";
    String word2 = "April";
    String word3 = "1995";
    }        
    
}

public static String concatenate(String word1, String word2, String word3) {
    // TODO: Write code that concatenates the input parameters and returns the result
    System.out.println(word1 + word2 + word3);
}


public static Boolean areEqual(String word1, String word2) {
    // TODO: Write code to determine whether the input parameters are equal strings
    System.out.println(word1 == word2);
}


public static String format(String item, int quantity, double price) {
    // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]"
    String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
}

