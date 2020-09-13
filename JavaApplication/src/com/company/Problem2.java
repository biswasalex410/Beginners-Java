package com.company;

import java.util.Scanner;

public class Problem2 {

    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Number of Elements:");
        int Elements=in.nextInt();
        int[] a=new int[Elements+1];
        a[Elements]=Integer.MAX_VALUE;

        System.out.println("Enter Elements:");

        for (int i = 0; i <Elements ; i++) {
            a[i]=in.nextInt();
        }

      QuickSort(a,0,Elements);


        for (int i = 0; i <Elements ; i++) {
            System.out.println(a[i]);
        }


    }




    public static int Partition(int[] a,int p,int r){
     int x=a[r];
     int i=p-1;
        for (int j = p; j <=r-1 ; j++) {
            if(a[j]<=x){
                i++;
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }

        int temp=a[i+1];
        a[i+1]=a[r];
        a[r]=temp;
        return i+1;
    }

    static void QuickSort(int []a,int p,int r){

        int q;
        if(p<r){
            q=Partition(a,p,r);

            QuickSort(a,p,q-1);

            QuickSort(a,q+1,r);
        }

    }

}
