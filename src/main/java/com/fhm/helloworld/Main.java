/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fhm.helloworld;

/**
 *
 * @author Francis
 */
public class Main {
    public static void main(String args[]){
        
        
        Greeting greeting = new GreetingGerman();
        
        
        System.out.println(greeting.message());
        
        greeting = new GreetingItalian();        
        System.out.println(greeting.message());
        
    }
}
