/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author harve
 */
public class DriverClass {
    
    public static void main(String[] args) {
        int[] test = {1,2,3,4,5};
        
        int[] unsorted = {20,532,230,5,10,52};
        
        LinearSearch problem1 = new LinearSearch();
        BinarySearch problem2 = new BinarySearch();
        BubbleSort problem3 = new BubbleSort();
        Problem01 primeObj = new Problem01();
        
        System.out.println(problem1.search(test, 1));
        
        System.out.println(problem2.runBinarySearchIteratively(test, 5, 0, 4));
        
        problem3.bubbleSort(unsorted, unsorted.length);
        for(int num: unsorted){
            System.out.println(num);
        }
        
        System.out.println(primeObj.getSumOfPrimes(20));
    }
}
