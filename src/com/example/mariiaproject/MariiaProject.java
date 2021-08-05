package com.example.mariiaproject;

public class MariiaProject {
    public static void main(String[] args) {

       /* var sort = new SortingArray();
        sort.SortArray();

        var fibTen = new FibonacciClass();
        fibTen.FIbCalculate();

        var elementC = new LettersFounder();
        elementC.Founder();*/

        var elementC = new LettersFounder();
        char[] charArray = {'r','b', 'h', 'c', 'd', 'e', 'o', 'c'};
        elementC.Search(charArray, 'c');

    }
}
