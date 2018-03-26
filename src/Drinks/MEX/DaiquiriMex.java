/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drinks.MEX;

import cocktail.Drink;

/**
 *
 * @author Bruno
 */
public class DaiquiriMex extends Drink{
    
    public DaiquiriMex (){
        this.name = "Daiquiri";
        this.price = 45F;
        this.ingredients.add("1 unit of Ginger");
        this.ingredients.add("lemon juice");
        this.ingredients.add("1 tbsp sugar");
    }
}
