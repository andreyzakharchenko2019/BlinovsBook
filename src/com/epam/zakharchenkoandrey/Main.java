package com.epam.zakharchenkoandrey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        // A1. В  каждом  слове  текста  k-ю  букву  заменить  заданным  символом.
        // Если k больше длины слова, корректировку не выполнять.

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter some sentence: ");
        String someSentence = reader.readLine();
        System.out.print("What letter do you want to change (int)? ");
        int kLatter = Integer.parseInt(reader.readLine());
        System.out.print("Enter the desired letter: ");
        String needLatter = reader.readLine();
        reader.close();

        if (kLatter > someSentence.length()) {
            System.out.println("Number is greater than the length of the string");
        }
        else {
            char oldChar = someSentence.charAt(kLatter);
            char newChar = needLatter.charAt(0);
            System.out.println(someSentence.replace(oldChar, newChar));
        }


    }
}
