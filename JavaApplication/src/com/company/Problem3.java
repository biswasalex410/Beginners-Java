package com.company;

import java.util.Scanner;

public class Problem3 {


    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter Number of Elements:");
        int Elements=in.nextInt();
        int[] a=new int[Elements+1];

        System.out.println("Enter Elements:");
        for (int i = 0; i <Elements ; i++) {
            a[i]=in.nextInt();
        }
        a[Elements]=Integer.MAX_VALUE;

        System.out.println("Enter Key:");
        int key=in.nextInt();

        System.out.println("Press 1 for Binary search 0 for Linear Search:");
        int choice=in.nextInt();
        if(choice==1){
        SolveInBinary(a,key);
        }else{
            SolveInLinear(a,key);
        }

    }

    static void SolveInBinary(int a[],int key){
        System.out.println("Choose Sorting method:");
        System.out.println("Press 1 for InsertionSort , 2 for BubbleSort, 3 For MergeSort, 4 for QuickSort");
        int choice=in.nextInt();
        if(choice==2){
            a=BubbleSort(a,a.length);
        }else if(choice==1){
            InsertionSort(a);
        }else if(choice==3){
            MergeSort(a,0,a.length-2);
        }else if(choice==4){

            QuickSort(a,0,a.length-1);
        }


        int index=binarySearch(a,0,a.length,key);
        if(index>=0){
            System.out.println("Key found at Index "+index);
        }else{
            System.out.println("Index not Found");
        }

    }

    static void SolveInLinear(int a[],int key){

        int index=LinerSearch(a,key);
        if(index>=0){
            System.out.println("Key found at Index "+index);
        }else{
            System.out.println("Index not Found");
        }

    }



    static  int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (arr[mid] == x)
                return mid;


            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);


            return binarySearch(arr, mid + 1, r, x);
        }


        return -1;
    }

    static int LinerSearch(int a[],int key){
        for (int i = 0; i <a.length ; i++) {
            if(a[i]==key){
                return i;
            }
        }return -1;
    }




    static int[] BubbleSort(int[] a,int size){
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
        int n = arr.length-1;

        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;


            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }


    static void MergeSort(int[] a, int low, int high) {
        if (low < high) {
            int mid = (high + low) / 2;
            MergeSort(a, low, mid);
            MergeSort(a, mid + 1, high);
            Merge(a, low, mid, high);
        }

    }

    static void Merge(int a[], int p, int q, int r) {
        int n1 = q - p + 1;
        int n2 = r - q;
        int L[] = new int[n1 + 2];
        int R[] = new int[n2 + 2];
        for (int i = 1; i <= n1; i++) {
            L[i] = a[p + i - 1];

        }
        for (int i = 1; i <= n2; i++) {
            R[i] = a[q + i];
        }
        L[n1 + 1] = Integer.MAX_VALUE;
        R[n2 + 1] = Integer.MAX_VALUE;
        int i = 1;
        int j = 1;
        for (int k = p; k <= r; k++) {
            if (L[i] <= R[j]) {
                a[k] = L[i];
                i++;
            } else {
                a[k] = R[j];
                j++;
            }
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
