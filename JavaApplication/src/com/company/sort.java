package com.company;

import java.util.Arrays;

public class sort {
    public static void main(String[] args) {

        int[] a={5,8,9,2,3,6};


        System.out.println();
        System.out.println();



            int index=LinearSearch(a,6,6);
        System.out.println(index);




    }


    static void BubbleSort(int[] a,int n){


        for (int i = 0; i <n-1 ; i++) {

            //for passes; per pass 1 element will be sorted;


            for (int j = 0; j <n-i-1 ; j++) {

                //element will be compared
                if(a[j]<a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;

                }

            }
        }




    }
    static  int LinearSearch(int[] a,int n,int key){

        for (int i = 0; i <n; i++) {
            if(a[i]==key) return i;
        }
        return -1;
    }


}
