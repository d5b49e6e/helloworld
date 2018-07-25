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
public class GreetingFactory {
 
     public Greeting createGreeting(LanguageType type){
            if(type==null)
                return null;
            if(type==LanguageType.FRENCH)
                return new GreetingFrench();
            if(type==LanguageType.GERMAN)
                return new GreetingGerman();
            if(type==LanguageType.ITALIAN)
                return new GreetingItalian();
            if(type==LanguageType.SPANISH)
                return new GreetingSpanish();
            return null;
        }
}
