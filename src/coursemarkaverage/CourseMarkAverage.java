/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coursemarkaverage;

import java.util.Scanner;

/**
 *
 * @author aemal4075
 */
public class CourseMarkAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyedInput = new Scanner (System.in);
        
        int [ ] numbers = new int [8];
        int total = 0;
        double average = 0;  
        
        System.out.println("please enter your 8 Marks for the school year 2017-2018:");
        for (int i = 0; i <= 7; i = i + 1)
        {
           numbers[i] = keyedInput.nextInt();
        }
        

        for (int i = 0; i <= 7; i = i + 1)
        {
             total = total + numbers[i];
        }
        
        for (int i = 0; i <= 7; i = i + 1)
        {
            average = total / 8;
        }
        
        System.out.println("Your Average for the School Year 2017-2018 is ");
        System.out.println(average);
        // TODO code application logic here
    }
    
}
