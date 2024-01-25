package com.utkarsh;
//search the largest number
import java.util.Scanner;


public class Kids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no of elements array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element in no");
         for( int i = 0; i < arr.length;i++)
         {

             arr[i] = sc.nextInt();
         }


        int result = findMax(arr);
        System.out.println(result);
    }
        public static int findMax(int[]arr){

        int max = arr[0];

            for (int i=0;i <arr.length ;i++) {
                if (arr[i] > max) {

                    max = arr[i];
                }
            }
            System.out.println("The largest no is:");
            return max;




    }

}
