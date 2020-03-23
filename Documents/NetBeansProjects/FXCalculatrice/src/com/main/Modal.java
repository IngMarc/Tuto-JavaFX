/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

/**
 *
 * @author Lenovo
 */
public class Modal {
    
    public float calculator(float number1, float number2, String operator){
         float result=0;
         switch(operator){
             case "+" : 
                 result=number1+number2;
                 break;
             case "-" : 
                 result=number1-number2;
                 break;
             case "*" : 
                 result=number1*number2;
                 break;
             case "/" : 
                 if(number1==0 ||number2==0)result=0;                 
                 result=number1/number2;
                 break;
            default:
                result=0;
                 break;
         }
        
        return result;
    }
    
}
