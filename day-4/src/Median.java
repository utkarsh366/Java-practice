//Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.
//
//The overall run time complexity should be O(log (m+n)).
//
//
//
//Example 1:
//
//Input: nums1 = [1,3], nums2 = [2]
//Output: 2.00000
//Explanation: merged array = [1,2,3] and median is 2.
//Example 2:
//
//Input: nums1 = [1,2], nums2 = [3,4]
//Output: 2.50000
//Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
//

import java.util.*;
public class Median {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[n];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }

        while (i < n1) {
            new_arr[k++] = nums1[i++];
        }

        while (j < n2) {
            new_arr[k++] = nums2[j++];
        }

        if (n % 2 == 0) {
            return (double) (new_arr[n / 2 - 1] + new_arr[n / 2]) / 2;
        } else {
            return new_arr[n / 2];
        }
    }

    public static void main(String[] args) {
        Median median = new Median();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println(median.findMedianSortedArrays(nums1, nums2)); // Output: 2.0
    }
}
