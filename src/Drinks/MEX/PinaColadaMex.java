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
public class PinaColadaMex extends Drink{
    
    public PinaColadaMex (){
        this.name = "Piña Colada";
        this.price = 48F;
        this.ingredients.add("1 unit of Ron");
        this.ingredients.add("Coconut cream");
        this.ingredients.add("Pineapple juice");
    }
}
