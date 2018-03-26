/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drinks.MTY;

import cocktail.Drink;


/**
 *
 * @author Bruno
 */
public class MargaritaMty extends Drink{
    
    public MargaritaMty (){
        this.name = "Margarita";
        this.price = 50F;
        this.ingredients.add("1 unit of Tequila");
        this.ingredients.add("lemon juice");
        this.ingredients.add("1 unit of Cointreau");
    }
}
