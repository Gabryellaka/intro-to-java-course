package com.cbfacademy.strings;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }

    public static String concatenate(String word1, String word2, String word3) {
        // TODO: Write code that concatenates the input parameters and returns the result
<<<<<<< c76b9a576c7c0785e4a594978d5b074cc896180b
        return  word1.concat(word2).concat(word3); 
        
=======
           String result= word1+word2+word3;
           return result;
>>>>>>> saving changes that were made before main was up to date
    }

    public static Boolean areEqual(String word1, String word2) {
        // TODO: Write code to determine whether the input parameters are equal strings
<<<<<<< c76b9a576c7c0785e4a594978d5b074cc896180b
        if (word1.equals(word2)){
            return true;
        }else{
            return false;
        }
    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]"
        return String.format("Item: %s. Price: £%.2f. Quantity: %d", item, price, quantity);
=======
        Boolean result= word1==word2;
        return result;

    }

    public static String format(String item, int quantity, double price) {
        // TODO: Write code to return a string formatted as follows: "Item: [item]. Price: £[amount]. Quantity: [quantity]". The date should be formatted as DD/MM/YYYY, e.g. 24/10/2023
        String result = "Item: " + item + ". Price: £" + price + ". Quantity: " + quantity;
        return result;
>>>>>>> saving changes that were made before main was up to date
    }
}

