/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) {   //4 units
        int index = Integer.MAX_VALUE;          //1 step / 1 unit

        while (low <= high) {
            int mid = low + ((high - low) / 2);  //logn steps / 1 unit
            if (sortedArray[mid] < key) {
                low = mid + 1;                   //at most logn steps / 1 unit
            } else if (sortedArray[mid] > key) {
                high = mid - 1;                  //at most logn steps / 1unit
            } else if (sortedArray[mid] == key) {
                index = mid;                    //1 step / 1unit
                break;
            }
        }
        return index;               //1 step
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    
    //Space complexity: O(1) --> assigns memory to sortedArray, key, low, high, index, mid
    //                           (binarySearch does not assign memory to an array hence not O(n)
    
    //Time complexity: O(logn) --> divides the list in half until key is found
}
