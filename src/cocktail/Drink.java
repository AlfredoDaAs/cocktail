/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocktail;

import java.util.ArrayList;

/**
 *
 * @author alfre
 */
public abstract class Drink {
    public String name;
    public float price;
    public ArrayList<String> ingredients = new ArrayList<String>();
    
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
        System.out.println("vertiendo bebida en vaso...");
    }
    
    public float getPrice(){
        return this.price;
    }
}
