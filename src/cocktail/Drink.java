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
        System.out.println("Adding ingredients...");
        for (String ing : ingredients){
            System.out.println(" "+ ing);
        }
    }
    
    public void mix(){
        System.out.println("Shaking it up " + name);
    }
    
    public void finish(){
        System.out.println("Pouring drink...");
    }
    
    public float getPrice(){
        return this.price;
    }
}
