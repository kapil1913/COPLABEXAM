package com.copLabExam.main;

import java.util.LinkedHashSet;

public class copLab {
	
	 // Function to remove duplicate from array
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
 
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
        
        System.out.println("array elements witout duplicate are :");
        // Print the elements of LinkedHashSet
        System.out.print(set);
       
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int a[] = {1,1,2,2,3,3,3,4,5,5,6,6,6,7,5,2,8,9,9};
     
        // Function call
        removeDuplicates(a);
       
    }

}
