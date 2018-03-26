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
public class MartiniMex extends Drink{
    
    public MartiniMex (){
        this.name = "Martini";
        this.price = 40F;
        this.ingredients.add("1 unit of Vodka");
        this.ingredients.add("1 unit of Vermouth");
        this.ingredients.add("1 olive");
    }
}
