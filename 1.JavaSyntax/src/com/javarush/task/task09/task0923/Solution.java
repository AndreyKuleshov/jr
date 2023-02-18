package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] strDate = reader.readLine().toCharArray();
        List<Character> vowelsList = new ArrayList<>();
        List<Character> notVowelsList = new ArrayList<>();
        for (char letter : strDate) {
            if (isVowel(letter)) vowelsList.add(letter);
            else if (!String.valueOf(letter).equals(" ")) notVowelsList.add(letter);
        }
        vowelsList.forEach(obj -> System.out.printf("%s ", obj));
        System.out.print("\n");
        notVowelsList.forEach(obj -> System.out.printf("%s ", obj));
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);  // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {  // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}