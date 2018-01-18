/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nahid.designpattern.creational;

/**
 *
 * @author nahid.hossain
 * Definition: A Factory Pattern or Factory Method Pattern says that just define an interface or
 * abstract class for creating an object but let the subclasses decide which class to instantiate
 *  Factory method : https://www.javatpoint.com/factory-method-design-pattern
 */
import java.io.*;    
class GenerateBill{  
    public static void main(String args[])throws IOException{  
      PlanFactory planFactory = new PlanFactory();  
        
      System.out.print("Enter the name of plan for which the bill will be generated: ");  
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
  
      String planName=br.readLine();  
      System.out.print("Enter the number of units for bill will be calculated: ");  
      int units=Integer.parseInt(br.readLine());  
  
      Plan p = planFactory.getPlan(planName);  
      //call getRate() method and calculateBill()method of DomesticPaln.  
  
       System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  
            p.getRate();  
           p.calculateBill(units);  
            
    }  
  }//end of GenerateBill class.  