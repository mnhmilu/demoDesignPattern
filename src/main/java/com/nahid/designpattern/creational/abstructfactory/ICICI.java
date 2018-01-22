/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.nahid.designpattern.creational.abstructfactory;

import com.nahid.designpattern.creational.abstructfactory.Bank;

/**
 *
 * @author nahid.hossain
 */
class ICICI implements Bank{  
       private final String BNAME;  
       ICICI(){  
                BNAME="ICICI BANK";  
        }  
        public String getBankName() {  
                  return BNAME;  
       }  
}  