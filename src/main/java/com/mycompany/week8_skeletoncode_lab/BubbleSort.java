/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up        
                //ToDo 3: complete this algorithm, test it, provide its time complexity
                if(a[inner] > a[inner + 1]){
                    temp = a[inner];
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;
                }
            }
        }
    }
    
    //outer loop executes n times
    //inner loop executes n times on the first iteration, but drops to 1 time on the last iteration
    //swap inside the inner loop is done in constant time
    //inner loop still executes n times initially (n/2 on average), hence:
    //O(n^2) quadratic
    
}
