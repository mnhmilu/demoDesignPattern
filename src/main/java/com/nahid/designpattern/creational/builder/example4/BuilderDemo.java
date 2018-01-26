/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nahid.designpattern.creational.builder.example4;

/**
 *
 * @author Asus
 * Definition: Construct a complex object from simple objects using step-by-step approach"
 * Example: https://stackoverflow.com/questions/5007355/builder-pattern-in-effective-java
 */
public class BuilderDemo {
     public static void main(String args[]) {
        NutritionalFacts n = 
            new NutritionalFacts.Builder(10).carbo(23).fat(1).build();
        n.print();
    }
}
