package com.example.mariiaproject;

public class LettersFounder {
    /*char[] charArray = {'r','b', 'h', 'c', 'd', 'e', 'o', 'c'};
    char toFound = 'c';
    int i;
    int number;
    public void Founder(){
        for (i=0; i<charArray.length; i++){
            if (charArray[i]==toFound) {
                number = i;
                System.out.println(number);
                //System.out.println("The "number" element equals c. ", number);
            }
        }
    }*/

    //char[] charArray = {'r','b', 'h', 'c', 'd', 'e', 'o', 'c'};
    char toFound;
    int i;
    int number;
    public void Search (char[] charArray, char toFound){
        for (i=0; i<charArray.length; i++) {
            if (charArray[i] == toFound) {
                number = i;
                System.out.println(number);
            }
            //System.out.println(number);
        }
    }
}
