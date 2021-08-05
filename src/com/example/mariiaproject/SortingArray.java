package com.example.mariiaproject;

public class SortingArray {
    int i;
    int j;
    int a;
    int min;
    int[] array = {5, 7, 2, 8, 1, 0};
    public void SortArray (){
        for (j=0; j<array.length; j++){
        for (i=0; i<array.length-1; i++) {
           if (array[i + 1] < array[i]) {
                min = array[i+1];
                array[i+1] = array[i];
                array[i] = min;
           }
        }
        }

        for (j = 0; j<array.length; j++){
            System.out.println(array[j]);
        }
    }

}
