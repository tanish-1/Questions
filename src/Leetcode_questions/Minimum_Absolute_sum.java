package Leetcode_questions;

import java.util.Arrays;
import java.util.HashMap;

public class Minimum_Absolute_sum {
    public  static  int bsfunc(int[] arr , int target){
        int[] arr1 = arr.clone();
        Arrays.sort(arr1);

        int low = 0 , high = arr1.length -1;
        while(low<=high){
            int mid = low + (high - low)/2;
            if(arr1[mid]>=target){
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return arr1[low];
    }

    public  static int minAbsoluteSumDiff(int[] arr1 , int[] arr2){
        int tsum = 0;
        int n = arr1.length;
         int[]  newarr1 = new int[n];

        for(int i = 0 ;i<n ; i++){
                newarr1[i] = Math.abs(arr2[i]-bsfunc(arr1,arr2[i]));
        }

        int[]  newarr2 = new int[n];
        for(int i = 0 ; i<n ; i++){

            if(arr1[i]==arr2[i]){
                newarr2[i] = Math.abs(arr1[i]-arr2[i]);
                continue;
            }
            if(arr1[i]!=arr2[i]) {
                tsum+=Math.abs(arr1[i]-arr2[i]);
                newarr2[i] = Math.abs(arr1[i]-arr2[i]);
            }
        }

        int max = 0;
        for(int i = 0 ; i<n ; i++){
            max = Math.max(max, Math.abs(newarr2[i] - newarr1[i]));
        }

        return tsum - max;
    }
    public static void main(String[] args) {
        int[] arr1 = {56,51,39,1,12,14,58,82,18,41,70,64,18,7,44,90,55,23,11,79,59,76,67,92,60,80,57,11,66,32,76,73,35,65,55,37,38,26,4,7,64,84,98,61,78,1,80,33,5,66,32,30,52,29,41,2,21,83,30,35,21,30,13,26,36,93,81,41,98,23,20,19,45,52,25,51,52,24,2,45,21,97,11,92,28,37,58,29,5,18,98,94,86,65,88,8,75,12,9,66};
        int[] arr2 = {64,32,98,65,67,40,71,93,74,24,49,80,98,35,86,52,99,65,15,92,83,84,80,71,46,11,26,70,80,2,81,57,97,12,68,10,49,80,24,18,45,72,33,94,60,5,94,99,14,41,25,83,77,67,49,70,94,83,55,17,61,44,50,62,3,36,67,10,2,39,53,62,44,72,66,7,3,6,80,38,43,100,17,25,24,78,8,4,36,86,9,68,99,64,65,15,42,59,79,66};
        System.out.println(minAbsoluteSumDiff(arr1,arr2));
//        HashMap<Integer>
    }
}
