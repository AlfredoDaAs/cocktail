/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drinks;

import java.util.ArrayList;

/**
 *
 * @author alfre
 */
public abstract class Drink {
    String name;
    float price;
    ArrayList<String> ingredients = new ArrayList<String>();
    
    public void prepare(){
        System.out.println("Agregando Ingredientes...");
        for (String ing : ingredients){
            System.out.println(" "+ ing);
        }
    }
    
    public void mix(){
        System.out.println("Mezclando bebida - " + name);
    }
    
    public void finish(){
        System.out.println("verter bebida en vaso...");
    }
    
    public float getPrice(){
        return this.price;
    }
}
