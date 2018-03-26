/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drinks.GDL;

import cocktail.Drink;

/**
 *
 * @author alfre
 */
public class Daiquiri extends Drink{
    
    public Daiquiri (){
        this.name = "Daiquiri";
        this.price = 45F;
        this.ingredients.add("lemon juice");
        this.ingredients.add("1 tbsp sugar");
    }
}
