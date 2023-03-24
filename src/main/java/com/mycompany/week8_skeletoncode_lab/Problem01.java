/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
    
    if(n == 2){ //base case
        return 2;
    }
    
    for(int i = 2; i < n; i++){
        if(n % i == 0){         //checks if not prime
            return getSumOfPrimes(n - 1);   //if not prime continue the recursion
        }
    }
    
    return n + getSumOfPrimes(n - 1);   //returns n only if the number is not prime
        
    }
    
    //Time complexity: O(n^2) 
    //The recursive call is made approximately n times
    //The for loop runs approximately n times initially, linearly decreasing to just once when n = 3
    
    
    //Space complexity: O(n)
    //Memory allocated for n, i
    //Each recursive call is another stack added
    //Since getSumOfPrimes() is called approximately n times, space complexity is O(n)
    
}
