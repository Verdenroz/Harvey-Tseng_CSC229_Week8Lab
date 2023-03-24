/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length;         //1 step
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - prvoide asymptotic analysis of the developed solution
         for(int i = 0; i < n; i++){    //n steps
             if(arr[i] == x){
                 return i;          //at most 1
             }
         }
         return -1;             //at most 1
    }
    
    //f(n) = n + 2
    //possible upper bound(f(n) <= cg(n)) : cg(n) = 3n, where n > 0 -->   O(n)
    //possible lower bound(f(n) >= cg(n)): cg(n) = n, where n > 0   -->   big-omega(n)
    //tight bound --> theta(n) as O(n) == big-omega(n)
    
    
}
