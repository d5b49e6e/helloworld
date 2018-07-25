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
        
        
        GreetingFactory factory = new GreetingFactory();
        Greeting greeting = factory.createGreeting(LanguageType.GERMAN);      
        System.out.println(greeting.message());
        
        greeting = factory.createGreeting(LanguageType.FRENCH);      
        System.out.println(greeting.message());
        
        
        greeting = factory.createGreeting(LanguageType.ITALIAN);      
        System.out.println(greeting.message());
        
        greeting = factory.createGreeting(LanguageType.SPANISH);      
        System.out.println(greeting.message());
        
        
    }
}
