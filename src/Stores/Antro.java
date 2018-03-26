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
public class Antro extends Store{

    @Override
    protected Drink createDrink(int type) {
        
        switch(type){
            case 1:
                return new Martini();
            case 2:
                return new Margarita();
            case 3:
                return new Daiquiri();
            case 4:
                return new PinaColada();
            default:
                return null;
        }
    }
    
}
