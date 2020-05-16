package com.aburgerguy.fizzbuzzQuestion;

public class Fizzbuzz {


    //This version is te first version that I figured out
    public String fizzyBuzzer(int maxNum){

        for(int i = 0; i < maxNum; i++){

            if (i%3 == 0 && i%5 == 0){ System.out.println("FizzBuzz"); }

            else if (i%3 == 0){ System.out.println("Fizz"); }

           else if (i%5 == 0){ System.out.println("Buzz"); }

           else{ System.out.println(i); }

        }
        return "Fizzy Buzzing Complete";
    }


    //This version uses a string called "key" to simplify the complexity of the problem.
    //Instead of having 3 if statements and an else, we have 2 if statements and the "key"
    //to send the final answer.

    public String strBlankFizzyBuzzer(int maxNum){
        for (int i = 0; i < maxNum; i++){

            String key = "";

            if (i%3 == 0) { key += "Fizz"; }

            if (i%5 == 0){ key += "Buzz"; }

            System.out.println(i + "  " +key);

        }
        return "Fizzy Buzzing Complete";
    }


}
