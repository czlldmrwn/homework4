/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework4;

/**
 *
 * @author НР
 */
public class Dictionary implements Comparable<Dictionary>{
    private String word;
    private String translate;

    public Dictionary(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getWord() {
        return word;
    }

    public String getTranslate() {
        return translate;
    }

    @Override
    public int compareTo(Dictionary q) {
        return word.compareTo(q.getWord());
    }
}
