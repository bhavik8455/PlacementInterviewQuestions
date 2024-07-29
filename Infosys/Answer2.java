import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i =0; i<len ; i++){
            arr[i] = sc.nextInt();
        }

        //finding the alititude within the range 0-1,1-2 and so on

        for(int i =0; i<len;i++){
            if(i!=0){
                arr[i] +=arr[i-1];

            }
        }

        for(int i =0 ;i<len;i++){
            int temp = i;
           

            for(int j = i+1 ; j<len;j++){

                if(arr[j]<arr[temp]){
                    temp = j;
                }
            }
             int temp1 =  arr[temp];
             arr[temp] = arr[i];
             arr[i] = temp1;
        }

        System.out.println(arr[len-1]);
        
    }
}