/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stores;

import cocktail.Drink;

/**
 *
 * @author alfre
 */
public abstract class Store {
    
    public Drink orderDrink(int type){
        Drink drink;
        
        drink = createDrink(type);
        
        drink.prepare();
        drink.mix();
        drink.finish();
        
        return drink;
    }
    
    protected abstract Drink createDrink(int type);
}
