/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stores;

import Drinks.GDL.Daiquiri;
import cocktail.Drink;
import Drinks.GDL.Margarita;
import Drinks.GDL.Martini;
import Drinks.GDL.PinaColada;

/**
 *
 * @author alfre
 */
public class AntroMTY extends Store{

    @Override
    protected Drink createDrink(int type) {
        Drink drink;
        
        switch(type){
            case 1:
                drink = new Martini();
                drink.ingredients.add("1 unit of Champagne");
                break;
            case 2:
                drink = new Margarita();
                drink.ingredients.add("1 unit of Rum");
                break;
            case 3:
                drink = new Daiquiri();
                drink.ingredients.add("1 unit of Vodka");
                break;
            case 4:
                drink = new PinaColada();
                drink.ingredients.add("1 unit of Tequila");
                break;
            default:
                return null;
        }
        
        return drink;
    }
}
