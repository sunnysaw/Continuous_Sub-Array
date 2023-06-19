/*
Question :
Given an unsorted array A of size N that contains only non-negative integers, find a
continuous sub-array which adds to a given number S.
In case of multiple subarrays, return the subarray which comes first on moving from left
to right.
You need to print the start and end index of answer subarray.
_____________________________________________________________________________________________________________
Input1:
N = 5, S = 12
A[] = {1,2,3,7,5}
Output1:
2 4
Input2:
N = 5, S = 5
A[] = {1,2,3,7,5}
Output2:
2 3
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int start,sizeOfArray,digit,sumOfArray = 0;
        System.out.println("Enter the size of array :");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Enter the sum of number that program should find :");
        digit = input.nextInt();
        for (start = 1; start < array.length; start++){
             sumOfArray += array[start];
             if (sumOfArray == digit){
                 System.out.println(start + " " + (start + 1));
             }
        }
    }
}