/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.homework4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author НР
 */
public class Homework4 {

    public static void main(String[] args) {
        System.out.println("Вариант 5, РИБО-04-21, Волженская Полина Александровна");
        List<Dictionary> words = new ArrayList<>();
        words.add(new Dictionary("trouble", "проблема"));
        words.add(new Dictionary("addiction", "зависимость"));
        words.add(new Dictionary("obscure", "непонятный"));
        words.add(new Dictionary("delinquent", "преступник"));
        words.add(new Dictionary("friend", "друг"));
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько слов вы хотите добваить?");
        int n = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Введите слово:");
            String newWord = scan.nextLine();
            System.out.println("Введите перевод:");
            String newTranslate = scan.nextLine();
            Iterator <Dictionary> iter = words.iterator();
            while (iter.hasNext()) {
                Dictionary d = iter.next();
                if (newWord.equalsIgnoreCase(d.getWord())) {
                    if (newTranslate.equalsIgnoreCase(d.getTranslate())) {
                         System.out.println("Этот перевод данного слова уже есть в словаре!");   
                    } else {
                        newTranslate = d.getTranslate() + "; " + newTranslate;
                        iter.remove();
                    }
                }
            }
           words.add(new Dictionary(newWord, newTranslate));
        }
        Collections.sort(words);
        for (Dictionary w : words) {
            System.out.println(w.getWord() + " - " + w.getTranslate());
        }
    }
}
