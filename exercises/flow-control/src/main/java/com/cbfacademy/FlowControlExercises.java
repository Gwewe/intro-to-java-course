package com.cbfacademy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        List<String> fizzBuzz = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);
            if (number % 3 == 0 && number % 5 == 0 ){
                fizzBuzz.add("FizzBuzz");
            } else if (number % 3 == 0){
                fizzBuzz.add("Fizz");
            } else if (number % 5 == 0){
                fizzBuzz.add("Buzz");
            } else {
                fizzBuzz.add(Integer.toString(number));
            }
        }
        return fizzBuzz;
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
        String fromNbtoMonth = " ";
        switch (number) {
            case 1:
                fromNbtoMonth ="January";
                break;
            case 2:
                fromNbtoMonth = "February";
                break;
            case 3:
                fromNbtoMonth = "March";
                break;
            case 4:
                fromNbtoMonth = "April";
                break;
            case 5:
                fromNbtoMonth = "May";
                break;
            case 6:
                fromNbtoMonth = "June";
                break;
            case 7:
                fromNbtoMonth = "July";
                break;
            case 8:
                fromNbtoMonth = "August";
                break;
            case 9:
                fromNbtoMonth = "September";
                break;
            case 10:
                fromNbtoMonth = "October";
                break;
            case 11:
                fromNbtoMonth = "November";
                break;
            case 12:
                fromNbtoMonth = "December";
                break;                
            default:
                fromNbtoMonth = "Invalid month number";
                break;
        }
        return fromNbtoMonth;
    }

    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}
        final IntStream numbers = IntStream.range(1, 101);
        final IntPredicate isEven = (int i) -> {return i % 2 == 0;};
        final IntPredicate isOdd = (int i) -> {return i % 2 != 0;};
        
        int SumOfEvens = numbers.filter(isEven).sum();
        int SumOfOdds = numbers.filter(isOdd).sum();

        HashMap<String, Integer> map = new HashMap<>();
        map.put("SumOfEvens", SumOfEvens);
        map.put("SumOfOdds", SumOfOdds);

        return map;
    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        Collections.reverse(numbers);
        return numbers;
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
