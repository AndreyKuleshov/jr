package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    static BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    static ArrayList<Integer> ints = new ArrayList<>();
    public static void readData() {
        //напишите тут ваш код
        try {
            int x = Integer.parseInt(reader.readLine());
            ints.add(x);
            readData();
        } catch (IOException | NumberFormatException e) {
            ints.forEach(System.out::println);
        }
    }
}
