package com.epam.zakharchenkoandrey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*Исключить из текста подстроку максимальной длины, начинающуюся и за-
        канчивающуюся одним и тем же символом.*/

public class С2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter some sentence: ");
        String someSentence = reader.readLine();
        String[] listSentence = someSentence.split("");
        Map<Integer, Integer> mapIndex = new HashMap<>();
        for (int i = 0; i < listSentence.length; i++) {
            System.out.print(listSentence[i] + " ");
            for (int j = listSentence.length - 1; j >= 0; j--) {
                if (listSentence[i].equals(listSentence[j]) && i < j) {
                    mapIndex.put(i, j);
                    break;
                }
                mapIndex.put(i, 0);
            }
        }

        int maxSubString = 0;
        int theFirstIndexKeyMaxSubString = 0;
        int theSecondIndexValueMaxSubString = 0;

        for (Map.Entry<Integer, Integer> pair : mapIndex.entrySet()) {
            int key = pair.getKey();
            int value = pair.getValue();
            System.out.println(key + " " + value);
            if (value - key > maxSubString) {
                maxSubString = value - key;
                theFirstIndexKeyMaxSubString = key;
                theSecondIndexValueMaxSubString = value;
            }
        }

        System.out.println(someSentence.substring(theFirstIndexKeyMaxSubString, theSecondIndexValueMaxSubString + 1));
    }
}