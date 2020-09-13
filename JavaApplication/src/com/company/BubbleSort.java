package com.company;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {


    }



    static int[] sort(int[] a,int size){
        int counter=0;

        for (int i = 0; i <3 ; i++) {

          boolean Isswaped=false;

            for (int j = 0; j <size-1-i; j++) {

                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    Isswaped=true;

                }
                counter++;

            }
            System.out.println(counter);
            if(Isswaped==false){
                return a ;
            }

        }

        return a;
    }



    static  void InsertionSort(int arr[])
    {
        int n = arr.length;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    static long fact(int n){

        long product=1;
        for (int i = 1; i <=n ; i++) {
            product*=i;
        }
        return product;
    }



}
