package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        int[] array5 = new int[5];
        int[] array2 = new int[2];
        int[] array4 = new int[4];
        int[] array7 = new int[7];
        int[] array0 = new int[0];
        ArrayList<int[]> mainArray = new ArrayList<>(5);
        mainArray.add(fillArray(array5));
        mainArray.add(fillArray(array2));
        mainArray.add(fillArray(array4));
        mainArray.add(fillArray(array7));
        mainArray.add(fillArray(array0));
        return mainArray;
    }
    public static int[] fillArray(int[] array) {
        int[] result = new int[array.length];
        for (int i=0; i<array.length; i++){
            result[i] = new Random().nextInt(999);
        }
        return result;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
